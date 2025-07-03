//package com.graphql.controller;
//
//
//
////-----------------------------Without_ GraphQL--------------------
//
//
//import com.graphql.entity.Book;
//import com.graphql.impl.BookServiceImpl;
//import com.graphql.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/books")
//public class BookControllerH2 {
//    @Autowired
//    private BookService bookService;
//
//    @PostMapping
//    public Book create (@RequestBody Book book){
//        return this.bookService.create(book);
//    }
//    //getall
//    @GetMapping
//    public List<Book> getAll(){
//        return this.bookService.getAll();
//    }
//
//    @GetMapping("/{bookId}")
//    public Book get( @PathVariable  String bookId){
//        return this.bookService.get(bookId);
//    }
//
//
//}
