package com.alibaba.dao;

import com.alibaba.domain.Book;

import java.util.List;
import org.springframework.data.repository.query.Param;

public interface BookDao {
    /**
     * 查询全部书籍
     */
    public  List<Book> getAllBooks();

    /**
     * 根据书籍名称，查询书籍
     */
    Book findByName(@Param("bookName") String bookName);
}