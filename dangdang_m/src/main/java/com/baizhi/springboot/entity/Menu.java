package com.baizhi.springboot.entity;

public class Menu {
    private Integer id;
    //菜单名字
    private String menuname;
    //资源路径
    private String resourceurl;
    private String parent_Id;

    public Menu() {
        super();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuname='" + menuname + '\'' +
                ", resourceurl='" + resourceurl + '\'' +
                ", parent_Id='" + parent_Id + '\'' +
                ", lev=" + lev +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    public String getParent_Id() {
        return parent_Id;
    }

    public void setParent_Id(String parent_Id) {
        this.parent_Id = parent_Id;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    //等级
    private Integer lev;

    public Menu(Integer id, String menuname, String resourceurl, String parent_Id, Integer lev) {
        this.id = id;
        this.menuname = menuname;
        this.resourceurl = resourceurl;
        this.parent_Id = parent_Id;
        this.lev = lev;
    }
}
