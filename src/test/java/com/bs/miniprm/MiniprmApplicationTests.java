package com.bs.miniprm;

import com.bs.miniprm.mapper.*;
import com.bs.miniprm.pojo.*;
import com.bs.miniprm.service.impl.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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
    private TrmanMapper trmanMapper;
    @Autowired
    private EqexpertMapper eqexpertMapper;
    @Autowired
    private EqexpertServiceImpl eqexpertServiceImpl;
    @Autowired
    private TraorgServiceImpl traorgServiceimpl;
    @Autowired
    private WorkerServiceImpl workerServiceImpl;

    @Autowired
    private CarServiceImpl carServiceImpl;
    @Autowired
    private FirelicenseServiceImpl firelicenseServiceImpl;
    @Autowired
    private AdminlicenseServiceImpl adminlicenseServiceImpl;

    @Test
    public void allLicense(){
        List<Firelicense> firelicenses = firelicenseServiceImpl.queryAll();
        List<Adminlicense> adminlicenses = adminlicenseServiceImpl.queryAll();
        List<Object> allLicense = new ArrayList<>();
        allLicense.addAll(firelicenses);
        allLicense.addAll(adminlicenses);
        for (Object o : allLicense) {
            System.out.println("o = " + o);
        }

    }


    @Test
    public void addCar(){
        Car car = new Car();
        car.setHeadName("1");
        car.setHeadTele("1");
        car.setHeadCompany("1");
        car.setHeadCard("1");
        car.setCarCompany("1");
        car.setCarBrand("1");
        car.setCarModel("1");
        car.setCarCategory("消防车");
        car.setCarSource("购买");
        car.setCarLicenseplatestatus(0);
        carServiceImpl.add(car);

    }


    @Test
    public void queryAllInspectors(){
        List<Worker> workers = workerServiceImpl.queryAllEqtech();
        for (Worker worker : workers) {
            System.out.println("worker = " + worker);
        }
    }

    @Test
    public void selectUnReviewTraorg(){
        List<Traorg> traorgs = traorgServiceimpl.queryUnReview();
        for (Traorg traorg : traorgs) {
            traorg.setTraorgStatus(1);
            traorgServiceimpl.update(traorg);
            System.out.println("traorg = " + traorg);
        }
    }

    @Test
    public void selectUnReview(){
        List<Eqexpert> eqexperts = eqexpertServiceImpl.queryUnReview();
        for (Eqexpert eqexpert : eqexperts) {
            System.out.println("eqexpert = " + eqexpert);
        }
    }
    @Test
    public void updateEqexpert(){
        Eqexpert eqexpert = eqexpertServiceImpl.selectById(1);
        eqexpert.setEqexpertLast(2);
        int i = eqexpertServiceImpl.update(eqexpert);
        System.out.println(i);
    }


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
    public void queryAllEqexpert(){
        List<Eqexpert> eqexperts = eqexpertMapper.selectAll();
        for (Eqexpert eqexpert : eqexperts) {
            System.out.println("eqexpert = " + eqexpert);
        }
    }
    @Test
    public void queryAllTrMan(){
        List<Trman> trmen = trmanMapper.selectAll();
        for (Trman trman : trmen) {
            System.out.println("trman = " + trman);
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
