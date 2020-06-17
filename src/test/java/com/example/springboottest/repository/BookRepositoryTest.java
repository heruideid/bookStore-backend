package com.example.springboottest.repository;

import com.example.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void save(){
        Book book=new Book();
        book.setAuthor("张三");
        book.setName("李白集");
        Book book1=bookRepository.save(book);
    }
}