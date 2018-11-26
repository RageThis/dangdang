package com.baizhi.springboot.entity;

public class Category {
    private Integer category_Id;
    private Integer parent_Id;
    private String category_Name;

    public Category() {
        super();
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_Id=" + category_Id +
                ", parent_Id=" + parent_Id +
                ", category_Name='" + category_Name + '\'' +
                '}';
    }

    public Integer getCategory_Id() {
        return category_Id;
    }

    public void setCategory_Id(Integer category_Id) {
        this.category_Id = category_Id;
    }

    public Integer getParent_Id() {
        return parent_Id;
    }

    public void setParent_Id(Integer parent_Id) {
        this.parent_Id = parent_Id;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public Category(Integer category_Id, Integer parent_Id, String category_Name) {
        this.category_Id = category_Id;
        this.parent_Id = parent_Id;
        this.category_Name = category_Name;
    }
}
