package com.jwt.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.springboot.models.User;

@Service
public class UserService {

    private List<User> store  = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "John Doe", "john123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "david cook", "david23@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "michael", "michael.019@gmail.com"));
}

     public List<User> getUsers(){
         return store;
     }
}
