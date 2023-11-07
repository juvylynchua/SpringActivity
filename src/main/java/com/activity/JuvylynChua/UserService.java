package com.activity.JuvylynChua;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(User userParam){
        User user = new User();
        user.setFirstName(userParam.getFirstName());
        user.setLastName(userParam.getLastName());
        user.setEmail(userParam.getEmail());
        user.setAddress(userParam.getAddress());
        return user;
    }
}
