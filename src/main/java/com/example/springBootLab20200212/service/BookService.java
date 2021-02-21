package com.example.springBootLab20200212.service;

import com.example.springBootLab20200212.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

import com.example.springBootLab20200212.Entity.Book;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){
        return bookDAO.getBooks();

    }

    public Book createBook(Book book) {
        return bookDAO.createBook(book);
    }
}

