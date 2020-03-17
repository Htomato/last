package com.bs.miniprm.pojo;

import javax.persistence.*;

public class Children {
    /**
     * 菜单项id
     */
    @Id
    @Column(name = "child_id")
    private Integer childId;

    /**
     * 菜单项姓名
     */
    @Column(name = "child_name")
    private String childName;

    /**
     * 菜单项跳转页面名
     */
    @Column(name = "child_nav_name")
    private String childNavName;

    /**
     * 菜单项图标
     */
    @Column(name = "child_image")
    private String childImage;

    /**
     * 左侧菜单栏id 主键
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 左侧菜单栏姓名
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 右侧组title
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * title_name
     */
    @Column(name = "group_name")
    private String groupName;

    /**
     * 获取菜单项id
     *
     * @return child_id - 菜单项id
     */
    public Integer getChildId() {
        return childId;
    }

    /**
     * 设置菜单项id
     *
     * @param childId 菜单项id
     */
    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    /**
     * 获取菜单项姓名
     *
     * @return child_name - 菜单项姓名
     */
    public String getChildName() {
        return childName;
    }

    /**
     * 设置菜单项姓名
     *
     * @param childName 菜单项姓名
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * 获取菜单项跳转页面名
     *
     * @return child_nav_name - 菜单项跳转页面名
     */
    public String getChildNavName() {
        return childNavName;
    }

    /**
     * 设置菜单项跳转页面名
     *
     * @param childNavName 菜单项跳转页面名
     */
    public void setChildNavName(String childNavName) {
        this.childNavName = childNavName;
    }

    /**
     * 获取菜单项图标
     *
     * @return child_image - 菜单项图标
     */
    public String getChildImage() {
        return childImage;
    }

    /**
     * 设置菜单项图标
     *
     * @param childImage 菜单项图标
     */
    public void setChildImage(String childImage) {
        this.childImage = childImage;
    }

    /**
     * 获取左侧菜单栏id 主键
     *
     * @return menu_id - 左侧菜单栏id 主键
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置左侧菜单栏id 主键
     *
     * @param menuId 左侧菜单栏id 主键
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取左侧菜单栏姓名
     *
     * @return menu_name - 左侧菜单栏姓名
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置左侧菜单栏姓名
     *
     * @param menuName 左侧菜单栏姓名
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取右侧组title
     *
     * @return group_id - 右侧组title
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置右侧组title
     *
     * @param groupId 右侧组title
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取title_name
     *
     * @return group_name - title_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置title_name
     *
     * @param groupName title_name
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Children{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                ", childNavName='" + childNavName + '\'' +
                ", childImage='" + childImage + '\'' +
                ", menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
