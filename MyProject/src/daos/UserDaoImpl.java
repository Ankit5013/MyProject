package daos;

import dto.User;
import utility.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

    public Connection conn;
    public PreparedStatement ps;
    
    @Override
    public int register(User user) 
    {
    	int a=0;
    	try
        {
        	conn=ConnectionProvider.getConnection();
        	ps=conn.prepareStatement("insert into user values(?,?,?,?,?)");
            ps.setString(1, user.getFirstname());
            ps.setString(2, user.getLastname());
            ps.setLong(3, user.getContact());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getPassword());
            a=ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return a;    
    }
    
    
    @Override
    public String validate(User user)
    {
        String s="";
    	try
        {
    		conn=ConnectionProvider.getConnection();
        	ps=conn.prepareStatement("select * from user where email=? and password=?");
            ps.setString(1,user.getEmail());
            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
           		s=rs.getString(1)+" "+rs.getString(2);
           	}
            else
            {	
            	s="error";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
        
    }


	@Override
	public int update(User user) 
	{
		int b=0;
		try {
		conn=ConnectionProvider.getConnection();
		ps=conn.prepareStatement("update user set firstname=?, lastname=?, contact=?, password=? where email=?");
		ps.setString(1, user.getFirstname());
		ps.setString(2, user.getLastname());
		ps.setLong(3, user.getContact());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getEmail());
		b=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return b;
	}


	@Override
	public int delete(String email, String password) {
		int i=0;
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("delete from user where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			i=ps.executeUpdate();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}


	@Override
	public List<User> viewUsers() {
		List<User> list=new ArrayList<User>();
		try 
		{
			conn=ConnectionProvider.getConnection();
			ps=conn.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				User user=new User();
				user.setFirstname(rs.getString(1));
				user.setLastname(rs.getString(2));
				user.setContact(rs.getLong(3));
				user.setEmail(rs.getString(4));
				user.setPassword(rs.getString(5));
				list.add(user);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

    
}
