package com.example.springboottest.controller;

import com.example.springboottest.entity.Book;
import com.example.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable Integer page, @PathVariable Integer size){
        Pageable pageable=PageRequest.of(page,size);
        return bookRepository.findAll(pageable);
    }

    @PostMapping("/addBook")
    public String save(@RequestBody Book book){
        Book result=bookRepository.save(book);
        if(result!=null) return "success";
        else return "failed";
    }
}
