package com.zwt.chars;

public class BookStore {
    private Integer id;
    private String writer;
    private String name;

    public BookStore() {
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "id=" + id +
                ", writer='" + writer + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
