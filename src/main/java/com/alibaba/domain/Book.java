package com.alibaba.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;

public class Book {

    private Integer id;

    private String bookname;

    private String author;

    private String description;

    public Book(Integer id, String bookname, String author, String description) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}