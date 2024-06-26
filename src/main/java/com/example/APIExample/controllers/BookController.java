package com.example.APIExample.controllers;

import com.example.APIExample.domain.Book;
import com.example.APIExample.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;
    public BookController(BookService service){
        this.service= service;
    }

    @GetMapping
    public String getBooks(){
        List<Book> books = this.service.getBooksFromLibrary();
        System.out.println(books);
        return "oii";
    }
}
