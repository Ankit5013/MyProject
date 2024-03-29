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

@WebServlet("/ShowUsersServlet")
public class ShowUsersServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		UserDao udi=new UserDaoImpl();
		session.setAttribute("users",udi.viewUsers());
		RequestDispatcher rd=request.getRequestDispatcher("ShowUsers.jsp");
		rd.forward(request, response);
	}

}
