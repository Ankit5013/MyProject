package productControllers;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String cid=request.getParameter("cid");
		String pid=request.getParameter("pid");
		String name=request.getParameter("name");
		String desc=request.getParameter("desc");
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quant"));
		String url=request.getParameter("url");
		
		Product product=new Product();
		product.setCategoryId(cid);
		product.setProductId(pid);
		product.setName(name);
		product.setDescription(desc);
		product.setPrice(price);
		product.setQuantity(quantity);
		product.setUrl(url);
		
		ProductDao pdi=new ProductDaoImpl();
		boolean b=pdi.add(product);
		if(b==true)
		{
			String msg="Product added successfully!!!!";
			request.setAttribute("add", msg);
			HttpSession session=request.getSession();
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeAdmin.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("Error while adding product");
			RequestDispatcher rd=request.getRequestDispatcher("/AddProduct.jsp");
			rd.include(request, response);
		}
	}

}
