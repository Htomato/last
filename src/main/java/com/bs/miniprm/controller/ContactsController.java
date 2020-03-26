package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.service.impl.ContactsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 李宇超
 * @date 2020年3月25日
 */
@RestController
@RequestMapping("contacts")
public class ContactsController {

    @Autowired
    private ContactsServiceImp contactsServiceImp;


    @RequestMapping("allContacts")
    public Object all(){
        List<Contacts> contacts = contactsServiceImp.queryAllContacts();
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
        int addStatus = contactsServiceImp.addContact(contact);
        return addStatus;
    }
}
