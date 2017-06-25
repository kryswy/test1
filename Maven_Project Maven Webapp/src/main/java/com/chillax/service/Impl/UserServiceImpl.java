package com.chillax.service.Impl;  
  
import java.util.List;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
    
import com.chillax.dao.UserDao;
import com.chillax.dto.User;  
import com.chillax.service.UserService;

  
@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;  
      
    public User getUserById(int userId) {  
        return userDao.queryByPrimaryKey(userId);  
    }  
  
  
    public void addUser(User user) {  
        userDao.insertUser(user);  
    }  
  
    @Override  
    public List<User> getAllUser() {  
        return userDao.getAllUser();  
    }  
  
}  