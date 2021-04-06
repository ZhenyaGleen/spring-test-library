package com.example.springtestlibrary.repository;

import com.example.springtestlibrary.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
