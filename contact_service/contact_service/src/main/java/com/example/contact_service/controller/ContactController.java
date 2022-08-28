package com.example.contact_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact_service.entity.Contact;
import com.example.contact_service.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @RequestMapping("/user/{userid}")
    public List<Contact> getContacts(@PathVariable("userid") Long userid) {
        return this.contactService.getContactOfUser(userid);
    }
}
