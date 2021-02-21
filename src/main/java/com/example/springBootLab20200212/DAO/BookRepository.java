package com.example.springBootLab20200212.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springBootLab20200212.Entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{
}
