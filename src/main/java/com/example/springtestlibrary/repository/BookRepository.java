package com.example.springtestlibrary.repository;

import com.example.springtestlibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
