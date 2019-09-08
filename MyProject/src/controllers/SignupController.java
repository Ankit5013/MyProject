package controllers;

import daos.UserDao;
import daos.UserDaoImpl;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
        try
        {
        	String fn=request.getParameter("fname");
        	String ln=request.getParameter("lname");
        	Long ph=Long.parseLong(request.getParameter("con"));
        	String un=request.getParameter("umail");
        	String p=request.getParameter("upass");
        	User user=new User();
        	user.setFirstname(fn);
        	user.setLastname(ln);
        	user.setContact(ph);
        	user.setEmail(un);
        	user.setPassword(p);
        	UserDao udi=new UserDaoImpl();
        	int flag=udi.register(user);
        
        	if(flag>0)
        	{
        		String msg="<h3 style='color:green'>You are successfully registered...</h3>";
        		request.setAttribute("true", msg);
        		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        		rd.forward(request, response);
        	}
        	else
        	{
        		out.println("Error");
        		RequestDispatcher rd=request.getRequestDispatcher("Signup.jsp");
        		rd.include(request, response);
        	}
        }
        catch(Exception e)
        {
        	out.print(e);
        }
    }

}