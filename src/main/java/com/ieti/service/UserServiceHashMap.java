package com.ieti.service;

import java.util.HashMap;
import java.util.List;

import com.ieti.entities.User;

public class UserServiceHashMap implements UserService{

    private HashMap<String, Object> usmap = new HashMap<String, Object>();

    @Override
    public User create(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User update(User user, String userId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
