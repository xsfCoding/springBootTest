package com.alibaba.dao;

import com.alibaba.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BookMapper {
    int insert(Book record);

    int insertSelective(Book record);

    /**
     * 查询全部书籍
     */
    public List<Book> getAllBooks();

    /**
     * 根据书籍名称，查询书籍
     */
    Book findByName(@Param("bookName") String bookName);


    List<Book> getAllBooks(int pageNum, int pageSize);
}