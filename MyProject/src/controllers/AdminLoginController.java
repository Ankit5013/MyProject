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


@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
	    String mail=request.getParameter("umail");
	    String pass=request.getParameter("upass");
	    
	    if(mail.equals("a@123")&&pass.equals("a123"))
	    {
	    	RequestDispatcher rd=request.getRequestDispatcher("WelcomeAdmin.jsp");
            rd.forward(request, response);
        }
        else
        {
            out.println("<div align='center' style='color:red'>Email or password is incorrect</div>");
            RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
            rd.include(request, response);
        }
	    
	}

}
