package com.example.APIExample.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String title;
    public String author;
    public String area;
    public String publisher;
    @JsonProperty("year_of_publisher")
    public String yearOfPublisher;
    public String isbn;
}
