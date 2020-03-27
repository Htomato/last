package com.bs.miniprm;

import com.bs.miniprm.mapper.ContactsMapper;
import com.bs.miniprm.mapper.MenuMapper;
import com.bs.miniprm.mapper.TrplanMapper;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.pojo.Menu;
import com.bs.miniprm.pojo.Trplan;
import com.bs.miniprm.service.impl.TrplanServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MiniprmApplicationTests {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private ContactsMapper contactsMapper;
    @Autowired
    private TrplanMapper trplanMapper;
    @Autowired
    private TrplanServiceImp trplanServiceImp;

//    @Test
//    public void queryAllTrplan(){
//        trplanServiceImp.queryAllTrplan();
//    }

    @Test
    void contextLoads() {
    }
    @Test
    public void queryAll(){
        List<Menu> menus = menuMapper.selectAll();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
    @Test
    public void queryAllContacts(){
        List<Contacts> contacts = contactsMapper.selectAll();
        for (Contacts contact : contacts) {
            System.out.println("contact = " + contact);
        }
    }
    @Test
    public void queryAllTrplan(){
        List<Trplan> trplans = trplanMapper.selectAll();
        for (Trplan trplan : trplans) {
            System.out.println("contact = " + trplan);
        }
    }
    @Test
    public void addContact(){
        Contacts contacts = new Contacts();
        contacts.setContactId(1);
        contacts.setContactName("李四");
        contacts.setContactTele("13213318589");
        contacts.setCompany("testcompany");
        contacts.setJob("testJob");

        int insert = 0;
        try {
            insert = contactsMapper.insert(contacts);
        } catch (Exception e) {
            System.out.println("插入失败");
        }finally {
            System.out.println(insert);
        }

}

}
