package com.bs.miniprm.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Menu {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "menu_name")
    private String menuName;

    private String groups;

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return groups
     */
    public String getGroups() {
        return groups;
    }

    /**
     * @param groups
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }


}
