package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.service.impl.ContactsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李宇超
 * @date 2020年3月25日
 */
@RestController
@RequestMapping("contacts")
public class ContactsController {

    @Autowired
    private ContactsServiceImpl contactsServiceImpl;


    @RequestMapping("allContacts")
    public Object all(){
        List<Contacts> contacts = contactsServiceImpl.queryAllContacts();
        for (Contacts contact : contacts) {
            System.out.println("contact = " + contact);
        }
        return contacts;
    }
    @GetMapping("/add")
    public int add(String data){
        System.out.println(data);
//      将JSON Str 转化成JSONObj
        JSONObject contactJson = (JSONObject) JSON.parse(data);
//      make the jsonObj to javaBean
        Contacts contact = contactJson.toJavaObject(Contacts.class);
        System.out.println(contact);
        int addStatus = contactsServiceImpl.addContact(contact);
        return addStatus;
    }
}
