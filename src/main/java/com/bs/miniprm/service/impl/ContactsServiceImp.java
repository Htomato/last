package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.ContactsMapper;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsServiceImp implements ContactsService {

    @Autowired
    private ContactsMapper contactsMapper;



    @Override
    public List<Contacts> queryAllContacts() {
        List<Contacts> contacts = contactsMapper.selectAll();
        return contacts;
    }

    @Override
    public void addContact(Contacts contacts) {
        contactsMapper.insert(contacts);
    }

}
