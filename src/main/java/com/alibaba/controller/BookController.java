package com.alibaba.controller;

import com.alibaba.domain.Book;
import com.alibaba.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  @author:xueshufeng
 *  @date:18-5-30
 *
 */
@RestController
@RequestMapping("/BookController")
public class BookController {
    @Autowired
    BookService bookService;

    /**
     * 获取Book列表
     */
    @RequestMapping(value = "/getInfo",method = RequestMethod.GET)
    public List<Book> getBookList(){
        return bookService.getAllBooks();
    }

    /**
     * 获取单本书籍
     * @param id
     * @return
     */
    @RequestMapping(value="/getBookById" ,method =RequestMethod.GET )
    public Book getBookById(@PathVariable Long id){
         return bookService.findById(id);
    }

    /**
     * 增加书籍
     * 通过 @RequestBody 绑定实体参数，也通过 @RequestParam 传递参数
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public int insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    /**
     * 删除书籍
     */
//    @RequestMapping(value = "/delete/${id}",method = RequestMethod.DELETE)
//    public Book deleteBook(@PathVariable Long id){
//        return bookService.deleteBook(id);
//
//    }

    /**
     * 删除 Book
     * 处理 "/book/{id}" 的 GET 请求，用来删除 Book 信息
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }


    /**
     * 修改书籍
     * @param book
     * @return
     */
    @RequestMapping(value="/modifyBook",method = RequestMethod.PUT)
    public Book modifyBook(Book book){
        return bookService.updateBook(book);

    }

    @ResponseBody
    @RequestMapping(value = "/allBooks/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return bookService.getAllBooks(pageNum,pageSize);
    }



}
