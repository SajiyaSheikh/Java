package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    List<User> userList =List.of(new User(1311,"Sajiya","8329222254"),
            new User(1312,"Najiya","9637780418"),
            new User(1314,"Wahid","9823517119"));


    @Override
    public User getUsers(int userId) {
        return userList.stream().filter(user -> user.getUserId()==userId).findAny().orElse(null);
    }


}
