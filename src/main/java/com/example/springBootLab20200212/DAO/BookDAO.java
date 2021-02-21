package com.example.springBootLab20200212.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.springBootLab20200212.Entity.Book;
import java.util.Collection;

@Component
public class BookDAO {
    @Autowired
    private BookRepository repository;

    public Collection<Book> getBooks(){
        return repository.findAll();
    }

    public Book  createBook(Book book){
        return repository.insert(book);
    }
}
