package service;

import java.io.Serializable;
import model.User;

public class AccountService implements Serializable {
   
    User user = new User();
    
    public User login(String username, String password) {
        if(username.equals("abe") || username.equals("barb")){
            if(password.equals("password")) {
                user.setPassword(null);
                user.setUsername(username);
                return user;
            }
        }
        return null;
    }
    
}
