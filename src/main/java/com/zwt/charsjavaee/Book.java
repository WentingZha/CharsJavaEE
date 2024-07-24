package com.zwt.charsjavaee;

public class Book {
    private String title;
    private int chapter;

    public Book(String title, int chapter) {
        this.title = title;
        this.chapter = chapter;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
}
