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
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un=request.getParameter("umail");
        String p=request.getParameter("upass");
     
        
        User user=new User();
        user.setEmail(un);
        user.setPassword(p);
       
        UserDaoImpl udi=new UserDaoImpl();
        String s= udi.validate(user);
        if(s.equalsIgnoreCase("error"))
        {
        	 out.println("<div align='center' style='color:red'>Email or password is incorrect</div>");
             RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
             rd.include(request, response);
        }
        else
        {
        	HttpSession session=request.getSession();
        	session.setAttribute("username",s);
        	session.setAttribute("email", user.getEmail());
        	response.sendRedirect("WelcomeUser.jsp");
        	
        }
    }      
}

