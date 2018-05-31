package com.alibaba.test;

import com.alibaba.dao.BookMapper;
import com.alibaba.domain.Book;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private BookMapper bookMapper;
    @org.junit.Test
    public void test() {
        Book book=new Book(1,"sisi","suis","this is a book");
        int book1=bookMapper.insert(book);
        Assert.assertEquals(1, book1);

    }



}
