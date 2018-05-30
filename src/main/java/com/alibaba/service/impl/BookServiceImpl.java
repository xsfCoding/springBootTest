package com.alibaba.service.impl;

import com.alibaba.domain.Book;
import com.alibaba.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BookServiceImpl implements BookService {
    private static Map<Long,Book> books=new HashMap<>();
    @Override
    public Book insertBook(Book book) {
        book.setId(books.size()+1);
        return books.put(book.getId(),book);
    }

    @Override
    public Book deleteBook(Long id) {
        return books.remove(id);
    }

    @Override
    public Book updateBook(Book book) {
        return books.put(book.getId(),book);
    }

    @Override
    public List<Book> getAllBooks() {
        System.out.println(new ArrayList<>(books.values()));
        System.out.println(" i am coming");
        return new ArrayList<>(books.values());
    }

    @Override
    public Book findById(Long id) {
        return books.get(id);
    }
}
