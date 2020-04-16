package com.bs.miniprm.service.impl;


import com.bs.miniprm.mapper.ContactsMapper;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    private ContactsMapper contactsMapper;



    @Override
    public List<Contacts> queryAllContacts() {
        List<Contacts> contacts = contactsMapper.selectAll();
        return contacts;
    }

    @Override
    public int addContact(Contacts contacts) {
        int insert = 0;
        try {
            insert = contactsMapper.insert(contacts);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return insert;
        }

    }

    @Override
    public int delete(int id) {
        return contactsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Contacts> queryByName(String name) {
        Example contactsExample = new Example(Contacts.class);
        contactsExample.createCriteria().andEqualTo("contactName",name);
        List<Contacts> contacts = contactsMapper.selectByExample(contactsExample);
        return contacts;
    }

}
