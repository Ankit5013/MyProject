package productControllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daos.ProductDao;
import daos.ProductDaoImpl;
import dto.Product;

@WebServlet("/ShowProductsServlet")
public class ShowProductsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Product pro=new Product();
		HttpSession session=request.getSession();
		ProductDao udi=new ProductDaoImpl();
		session.setAttribute("pro",udi.getAllProducts());
		RequestDispatcher rd=request.getRequestDispatcher("ShowProducts.jsp");
		rd.forward(request, response);
	}

}
