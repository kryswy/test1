package com.chillax.service;  
  
import java.util.List;  
  
import com.chillax.dto.User;  
  
public interface UserService {  
      
    public User getUserById(int userId);  
  
    public void addUser(User user);  
  
    public List<User> getAllUser();  
}  