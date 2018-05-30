package com.alibaba.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    /**
     * 书记编号
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * 书籍名称
     */

    private String bookName;

    /**
     * 书记作者
     */

    private  String Author;
    /**
     * 描述
     */

    private  String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
