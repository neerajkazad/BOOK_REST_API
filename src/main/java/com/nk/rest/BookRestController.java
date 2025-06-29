package com.nk.rest;

import com.nk.binding.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @PostMapping(value = "/book", consumes = {"application/xml", "application/json"})
    public ResponseEntity<String> addBook(@RequestBody Book book){
        System.out.println(book);
        //logic to save in db
        String msg = "Record Saved Successfully";
        return new ResponseEntity<>(msg,HttpStatus.CREATED);
    }


    @GetMapping(value = "/book", produces = {"application/xml", "application/json"})
    public Book getBook(){

        Book book = new Book();
        book.setId(101);
        book.setName("Java");
        book.setPrice(130.00);

        return book;
    }
}
