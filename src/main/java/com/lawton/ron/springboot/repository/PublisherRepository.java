package com.lawton.ron.springboot.repository;


import com.lawton.ron.springboot.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

