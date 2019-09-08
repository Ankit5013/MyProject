package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Product;
import dto.User;
import utility.ConnectionProvider;

public class ProductDaoImpl implements ProductDao
{
	public Connection conn;
	public PreparedStatement ps;
	public boolean b=false;
	@Override
	public boolean add(Product product) 
	{
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			ps.setString(1, product.getCategoryId());
			ps.setString(2, product.getProductId());
			ps.setString(3, product.getName());
			ps.setString(4, product.getDescription());
			ps.setInt(5, product.getPrice());
			ps.setInt(6, product.getQuantity());
			ps.setString(7, product.getUrl());
			int a=ps.executeUpdate();
			while(a>0)
				b=true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean update(Product product, String productId) 
	{
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("update product set categoryid=?, name=?, description=?, price=?, quantity=?, url=? where productid=?");
			ps.setString(1, product.getCategoryId());
			ps.setString(2, product.getName());
			ps.setString(3, product.getDescription());
			ps.setInt(4, product.getPrice());
			ps.setInt(5, product.getQuantity());
			ps.setString(6, product.getUrl());
			ps.setString(7, productId);
			int a=ps.executeUpdate();
			while(a>0)
				b=true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return b;
		
	}

	@Override
	public boolean delete(String productId) {
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("delete from product where productid=?");
			ps.setString(1, productId);
			int i=ps.executeUpdate();
			while(i>0)
				b=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list=new ArrayList<Product>();
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Product product=new Product();
				product.setCategoryId(rs.getString(1));
				product.setProductId(rs.getString(2));
				product.setName(rs.getString(3));
				product.setDescription(rs.getString(4));
				product.setPrice(rs.getInt(5));
				product.setQuantity(rs.getInt(6));
				product.setUrl(rs.getString(7));
				list.add(product);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	

}
