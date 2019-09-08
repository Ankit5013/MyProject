package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Category;
import utility.ConnectionProvider;

public class CategoryDaoImpl implements CategoryDao 
{
	public Connection conn;
	public PreparedStatement ps;
	public boolean b=false;
	@Override
	public boolean add(Category category) 
	{
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("insert into category values(?,?)");
			ps.setString(1, category.getCategoryId());
			ps.setString(2, category.getName());
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
	public boolean delete(String categoryId) 
	{
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("delete from category where categoryId=?");
			ps.setString(1, categoryId);
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
	public List<Category> getAllCategories() 
	{
		List<Category> list=new ArrayList<Category>();
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("select * from category");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Category category=new Category();
				category.setCategoryId(rs.getString(1));
				category.setName(rs.getString(2));
				list.add(category);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
