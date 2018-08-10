package com.lawton.ron.springboot.repository;

import com.lawton.ron.springboot.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long>{
}
