package com.graphql.service;

import com.graphql.entity.Book;

import java.util.List;

public interface BookService {
    Book create (Book book);
    List<Book> getAll();
    Book get(String bookId);
}
