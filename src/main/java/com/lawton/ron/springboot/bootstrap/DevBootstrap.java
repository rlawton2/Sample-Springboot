package com.lawton.ron.springboot.bootstrap;

import com.lawton.ron.springboot.model.Book;
import com.lawton.ron.springboot.model.Author;
import com.lawton.ron.springboot.model.Publisher;
import com.lawton.ron.springboot.repository.AuthorRepository;
import com.lawton.ron.springboot.repository.BookRepository;
import com.lawton.ron.springboot.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        iniData();
    }

    private void iniData(){
        Publisher ch = new Publisher("Clearing House");
        publisherRepository.save(ch);

        Author bob = new Author("Bob", "Franks");
       Book ht = new Book("Happy Times", "189203", ch);

       bob.getBooks().add(ht);
       ht.getAuthors().add(bob);

       authorRepository.save(bob);
       bookRepository.save(ht);

        Author tim = new Author("Tim", "Jones");
        Book gt = new Book("Good Times", "78303", ch);
        tim.getBooks().add(ht);
        gt.getAuthors().add(bob);

        authorRepository.save(tim);
        bookRepository.save(gt);
    }
}
