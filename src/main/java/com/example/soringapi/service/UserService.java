package com.example.soringapi.service;

import com.example.soringapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        // create 2 others user
        User user = new User(1,"John Doe", 32, "JohnDor@gmail.fr");
        User user1 = new User(2,"Smith lacroix", 33, "Smith@gmail.fr");
        User user2 = new User(3,"Louis Carter", 34, "Louis@gmail.fr");
        User user3 = new User(4,"Susie Brown", 35, "Susie@gmail.fr");
        User user4 = new User(5,"Michel Brut", 36, "Michel@gmail.fr");

        userList.addAll(Arrays.asList(user, user1, user2, user3, user4));
    }

    public User getUser(Integer id) {
        for ()
    }
}
