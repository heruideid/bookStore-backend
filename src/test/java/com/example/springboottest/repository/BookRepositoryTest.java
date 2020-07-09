package com.example.springboottest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

}