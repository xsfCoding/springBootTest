package com.alibaba.service;

import com.alibaba.domain.Book;

import java.util.List;

public interface BookService {

    //新增书籍
    Book insertBook(Book book);

    //删除书籍
    Book deleteBook(Long id);

    //update
    Book updateBook(Book book);

    //查询全部书籍
    List<Book> getAllBooks();

    //获取特定书籍
    Book findById(Long id);

}
