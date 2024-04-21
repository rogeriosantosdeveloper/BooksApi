package com.example.APIExample.feign;

import com.example.APIExample.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "book-api", url = "http://localhost:8080/api/book")
public interface BookClient {
    @GetMapping("/books.json")
    List<Book> getBooks();

}
