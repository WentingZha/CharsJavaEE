package com.zwt.charsjavaee.e_ajax.e5_paging.chars;

public class News {
    private int id;
    private String title;

    public News() {
    }

    public News(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
