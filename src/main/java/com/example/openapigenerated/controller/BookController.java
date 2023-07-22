package com.example.openapigenerated.controller;

import com.example.openapigenerated.api.BookApi;
import com.example.openapigenerated.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController implements BookApi {



  @Override
  public ResponseEntity<List<Book>> getAllBooksInLibrary() {
    List<Book> books = new ArrayList<>();
    books.add(new Book().id(1).title("The Lord of the Rings").author("J. R. R. Tolkien"));
    return new ResponseEntity<>(books, HttpStatus.OK);
  }

}
