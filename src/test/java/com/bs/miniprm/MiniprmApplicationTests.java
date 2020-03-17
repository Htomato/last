package com.bs.miniprm;

import com.bs.miniprm.mapper.ChildrenMapper;
import com.bs.miniprm.mapper.MenuMapper;
import com.bs.miniprm.pojo.Children;
import com.bs.miniprm.pojo.Menu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MiniprmApplicationTests {
    @Autowired
    private ChildrenMapper childrenMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Test
    void contextLoads() {
    }
    @Test
    public void testAutowire(){
        List<Children> children = childrenMapper.selectAll();
        for (Children child : children) {

        }
    }
    @Test
    public void queryAll(){
        List<Menu> menus = menuMapper.selectAll();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

}
