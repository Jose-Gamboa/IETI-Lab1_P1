package com.ieti.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ieti.entities.User;

@Service
public class UserServiceHashMap implements UserService{

    private HashMap<String, User> usmap = new HashMap<String, User>();

    @Override
    public User create(User user) {
        usmap.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        if(usmap.get(id) == null){return null;}
        return usmap.get(id);
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.addAll(usmap.values());
        return users;
    }

    @Override
    public void deleteById(String id) {
        usmap.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        usmap.replace(userId, user);
        return user;
    }
    
}
