package com.alibaba.service.impl;

import com.alibaba.dao.BookMapper;
import com.alibaba.domain.Book;
import com.alibaba.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class BookServiceImpl implements BookService
{
    @Autowired
    private BookMapper bookMapper;

//    public void setBookMapper(BookMapper bookMapper) {
//        this.bookMapper = bookMapper;
//    }

    @Override
    public int insertBook(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Book deleteBook(Long id) {
        return null;
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public Book findByName(String name) {
        return bookMapper.findByName(name);
    }

    @Override
    public List<Book> getAllBooks(int pageNum, int pageSize) {
        return bookMapper.getAllBooks(pageNum,pageSize);
    }


//    private static Map<Integer, Book> books=new HashMap<>();
//    @Override
//    public Book insertBook(Book book) {
//        book.setId(books.size()+1);
//        return books.put(book.getId(),book);
//    }
//
//    @Override
//    public Book deleteBook(Long id) {
//        return books.remove(id);
//    }
//
//    @Override
//    public Book updateBook(Book book) {
//        return books.put(book.getId(),book);
//    }
//
//    @Override
//    public List<Book> getAllBooks() {
//        System.out.println(new ArrayList<>(books.values()));
//        System.out.println(" i am coming");
//        return new ArrayList<>(books.values());
//    }
//
//    @Override
//    public Book findById(Long id) {
//        return books.get(id);
//    }
}
