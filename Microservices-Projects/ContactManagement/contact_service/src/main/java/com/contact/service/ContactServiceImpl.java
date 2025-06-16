package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> userContacts=List.of(new Contact(1,"Suraj@gmail.com","Suraj Dongre",1311),
            new Contact(2,"Diksha@gmail.com","Diksha",1311),
            new Contact(3,"Ravi@gmail.com","Ravi",1312),
            new Contact(4,"Priya@gmail.com","priya",1314));

    @Override
    public List<Contact> getContactsOfUser(int userId) {
        return userContacts.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
    }
}

