package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UserDao;
import daos.UserDaoImpl;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String email=request.getParameter("umail");
		String pass=request.getParameter("upass");
		UserDao udi=new UserDaoImpl();
		int i=udi.delete(email,pass);
		if(i>0)
		{
			String msg1="<h3 style='color:red'> Account successfully deleted</h4>";
			request.setAttribute("del", msg1);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("Account not deleted");
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}
	}

}
