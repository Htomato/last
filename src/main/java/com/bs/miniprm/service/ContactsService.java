package com.bs.miniprm.service;

import com.bs.miniprm.pojo.Contacts;

import java.util.List;

/**
 * @author 李宇超
 */
public interface ContactsService {
    /**
     *
     * 查询contacts的所有对象，返回
     * @return List
     */
    List<Contacts> queryAllContacts();

    /**
     * 添加contact
     * @param contacts-联系人
     */
    void addContact( Contacts contacts);
}