package com.graphql.impl;

import com.graphql.entity.Book;
import com.graphql.repository.BookRepo;
import com.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
 @Autowired
    private BookRepo bookRepo;


    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        Iterable<Book> allBooks = bookRepo.findAll();
        List<Book> bookList = new ArrayList<>();
        allBooks.forEach(bookList::add);
        return bookList;
    }


    @Override
    public Book get(String  bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("Book not found of this id"));
    }
}
