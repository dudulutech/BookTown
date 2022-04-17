package com.example.BookTown.Service;

import com.example.BookTown.Entity.Book;

import java.util.List;

public interface BookService {

    Book addItem(Book item);
    List<Book> getAllItems();
    Book getItem(Long id);
    void deleteItem(Book item);
    Book saveItem(Book item);

}
