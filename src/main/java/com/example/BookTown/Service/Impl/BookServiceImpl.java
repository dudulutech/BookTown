package com.example.BookTown.Service.Impl;

import com.example.BookTown.Entity.Book;
import com.example.BookTown.Repository.BookRepository;
import com.example.BookTown.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addItem(Book item) {
        return bookRepository.save(item);
    }

    @Override
    public List<Book> getAllItems() {
        return bookRepository.findAllByAmountGreaterThanOrderByPriceDesc(0);
    }

    @Override
    public Book getItem(Long id) {
        return bookRepository.findByIdAndAmountGreaterThan(id,0);
    }

    @Override
    public void deleteItem(Book item) {
        bookRepository.delete(item);
    }

    @Override
    public Book saveItem(Book item) {
        return bookRepository.save(item);
    }

}
