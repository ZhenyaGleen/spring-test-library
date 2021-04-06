package com.example.springtestlibrary.repository;

import com.example.springtestlibrary.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
