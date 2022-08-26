package com.techque.jpaintroduction.bootstrap;

import com.techque.jpaintroduction.domain.Book;
import com.techque.jpaintroduction.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book bookDDD = new Book("Domain Driven Design","ISBN1001","Wrox Publication");
        //return updated book record with primary key ID updated in object
        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("Book ID : "+ savedDDD.getId());

        Book bookSIA = new Book("Spring in Action","ISBN1001","Wrox Publication");
        Book savedSIA = bookRepository.save(bookSIA);
        System.out.println("Book ID : "+ savedSIA.getId());

        bookRepository.findAll().forEach(book->{
            System.out.println("Book ID : " + book.getId());
            System.out.println("Book Title : " + book.getTitle());
        });

    }
}
