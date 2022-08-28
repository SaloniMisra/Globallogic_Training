package com.example.user_service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user_service.entity.User;
@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1007L, "Durgesh Tiwari", "23525625"),
            new User(1008L, "Ankit Tiwari", "99999"),
            new User(1009L, "Ravi Tiwari", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}