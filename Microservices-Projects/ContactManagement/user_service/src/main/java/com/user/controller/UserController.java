package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") int userId)
    {
        User users = this.userService.getUsers(userId);

        // uri for contacting contact service
        // http://localhost:9002/contact/user/1311
        List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+ users.getUserId(), List.class);
        users.setContacts(contacts);

        return users ;
    }
}
