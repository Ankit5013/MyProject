package categoryControllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daos.CategoryDao;
import daos.CategoryDaoImpl;


@WebServlet("/ShowCategoriesServlet")
public class ShowCategoriesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		CategoryDao cdi=new CategoryDaoImpl();
		session.setAttribute("cat", cdi.getAllCategories());
		RequestDispatcher rd=request.getRequestDispatcher("ShowCategories.jsp");
		rd.forward(request, response);
	}

}
