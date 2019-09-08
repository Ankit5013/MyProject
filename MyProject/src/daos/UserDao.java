package daos;

import java.util.List;

import dto.User;

public interface UserDao 
{
    public int register(User user);
    public String validate(User user);
    public int update(User user);
    public int delete(String email, String password);
    public List<User> viewUsers() ;
    
}

