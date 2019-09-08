package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daos.UserDao;
import daos.UserDaoImpl;
import dto.User;

@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
private HttpSession session;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("umail");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		Long con=Long.parseLong(request.getParameter("con"));
		String pass=request.getParameter("upass");
		
		User user=new User();
		user.setEmail(email);
		user.setFirstname(fname);
		user.setLastname(lname);
		user.setContact(con);
		user.setPassword(pass);
	
		UserDao udi=new UserDaoImpl();
		int a=udi.update(user);
		if(a>0)
		{
			String msg="<h3 style='color:green'; 'text-align:center'>Your details are successfully updated...</h3>";
			request.setAttribute("upd", msg);
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeUser.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("Values not updated!!!!");
			RequestDispatcher rd=request.getRequestDispatcher("UpdateUser.jsp");
			rd.include(request, response);
		}
	}

}
