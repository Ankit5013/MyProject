package categoryControllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.CategoryDao;
import daos.CategoryDaoImpl;
import dto.Category;

@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String cid=request.getParameter("id");
		String name=request.getParameter("name");
		
		Category category=new Category();
		category.setCategoryId(cid);
		category.setName(name);
		
		CategoryDao cdi=new CategoryDaoImpl();
		boolean b=cdi.add(category);
		if(b==true)
		{
			String msg="Category added successfully!!!!";
			request.setAttribute("catg", msg);
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeAdmin.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("Error while adding category");
			RequestDispatcher rd=request.getRequestDispatcher("AddCategory.jsp");
			rd.include(request, response);
		}
		
	}

}
