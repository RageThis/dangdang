package com.baizhi.springboot.entity;

import java.util.Date;

public class Product {
    private Integer book_Id;
    private Integer cid;
    private String book_Name;
    private Double book_Price;
    //出版时间
    private Date groundingDate;
    //书籍状态
    private String book_State;
    //销量
    private Integer inventory;
    private String author;
    //出版社
    private String press;
    //???
    private Integer editNum;
    //上架时间
    private Date print_Date;
    //上架销量
    private Integer print_Count;
    //???
    private String isbn;
    private String word_Count;
    private String page_Count;
    private String style;
    private String page;
    private String pack;
    private Integer salenum;
    private Double custome_score;
    private String recommend;
    private String messages;
    private String author_Msg;
    private String list;
    private String media_Comment;
    private String imagePath;
    private String series_Name;
    private Double dangPrice;
    private String product_Image;
    private Category cg;

    public Category getCg() {
        return cg;
    }

    public void setCg(Category cg) {
        this.cg = cg;
    }

    public Product() {
        super();
    }

    @Override
    public String toString() {
        return "Product{" +
                "book_Id=" + book_Id +
                ", cid=" + cid +
                ", book_Name='" + book_Name + '\'' +
                ", book_Price=" + book_Price +
                ", groundingDate=" + groundingDate +
                ", book_State='" + book_State + '\'' +
                ", inventory=" + inventory +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", editNum=" + editNum +
                ", print_Date=" + print_Date +
                ", print_Count=" + print_Count +
                ", isbn='" + isbn + '\'' +
                ", word_Count='" + word_Count + '\'' +
                ", page_Count='" + page_Count + '\'' +
                ", style='" + style + '\'' +
                ", page='" + page + '\'' +
                ", pack='" + pack + '\'' +
                ", salenum=" + salenum +
                ", custome_score=" + custome_score +
                ", recommend='" + recommend + '\'' +
                ", messages='" + messages + '\'' +
                ", author_Msg='" + author_Msg + '\'' +
                ", list='" + list + '\'' +
                ", media_Comment='" + media_Comment + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", series_Name='" + series_Name + '\'' +
                ", dangPrice=" + dangPrice +
                ", product_Image='" + product_Image + '\'' +
                ", cg=" + cg +
                '}';
    }

    public Integer getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(Integer book_Id) {
        this.book_Id = book_Id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public Double getBook_Price() {
        return book_Price;
    }

    public void setBook_Price(Double book_Price) {
        this.book_Price = book_Price;
    }

    public Date getGroundingDate() {
        return groundingDate;
    }

    public void setGroundingDate(Date groundingDate) {
        this.groundingDate = groundingDate;
    }

    public String getBook_State() {
        return book_State;
    }

    public void setBook_State(String book_State) {
        this.book_State = book_State;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getEditNum() {
        return editNum;
    }

    public void setEditNum(Integer editNum) {
        this.editNum = editNum;
    }

    public Date getPrint_Date() {
        return print_Date;
    }

    public void setPrint_Date(Date print_Date) {
        this.print_Date = print_Date;
    }

    public Integer getPrint_Count() {
        return print_Count;
    }

    public void setPrint_Count(Integer print_Count) {
        this.print_Count = print_Count;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getWord_Count() {
        return word_Count;
    }

    public void setWord_Count(String word_Count) {
        this.word_Count = word_Count;
    }

    public String getPage_Count() {
        return page_Count;
    }

    public void setPage_Count(String page_Count) {
        this.page_Count = page_Count;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Double getCustome_score() {
        return custome_score;
    }

    public void setCustome_score(Double custome_score) {
        this.custome_score = custome_score;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getAuthor_Msg() {
        return author_Msg;
    }

    public void setAuthor_Msg(String author_Msg) {
        this.author_Msg = author_Msg;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getMedia_Comment() {
        return media_Comment;
    }

    public void setMedia_Comment(String media_Comment) {
        this.media_Comment = media_Comment;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSeries_Name() {
        return series_Name;
    }

    public void setSeries_Name(String series_Name) {
        this.series_Name = series_Name;
    }

    public Double getDangPrice() {
        return dangPrice;
    }

    public void setDangPrice(Double dangPrice) {
        this.dangPrice = dangPrice;
    }

    public String getProduct_Image() {
        return product_Image;
    }

    public void setProduct_Image(String product_Image) {
        this.product_Image = product_Image;
    }

    public Product(Integer book_Id, Integer cid, String book_Name, Double book_Price, Date groundingDate, String book_State, Integer inventory, String author, String press, Integer editNum, Date print_Date, Integer print_Count, String isbn, String word_Count, String page_Count, String style, String page, String pack, Integer salenum, Double custome_score, String recommend, String messages, String author_Msg, String list, String media_Comment, String imagePath, String series_Name, Double dangPrice, String product_Image) {
        this.book_Id = book_Id;
        this.cid = cid;
        this.book_Name = book_Name;
        this.book_Price = book_Price;
        this.groundingDate = groundingDate;
        this.book_State = book_State;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.editNum = editNum;
        this.print_Date = print_Date;
        this.print_Count = print_Count;
        this.isbn = isbn;
        this.word_Count = word_Count;
        this.page_Count = page_Count;
        this.style = style;
        this.page = page;
        this.pack = pack;
        this.salenum = salenum;
        this.custome_score = custome_score;
        this.recommend = recommend;
        this.messages = messages;
        this.author_Msg = author_Msg;
        this.list = list;
        this.media_Comment = media_Comment;
        this.imagePath = imagePath;
        this.series_Name = series_Name;
        this.dangPrice = dangPrice;
        this.product_Image = product_Image;
    }
}
