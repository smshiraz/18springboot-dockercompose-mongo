package com.syed.springbootdockercomposemongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.syed.springbootdockercomposemongo.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {
}