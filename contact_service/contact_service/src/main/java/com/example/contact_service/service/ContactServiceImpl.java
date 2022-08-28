package com.example.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.contact_service.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 1007L),
            new Contact(2L, "anil@gmail.com", "Anil", 1007L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 1008L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1008L)
    );


    @Override
    public List<Contact> getContactOfUser(Long userid) {
        return list.stream().filter(contact -> contact.getUserId().equals(userid)).collect(Collectors.toList());
    }
}
