package com.example.BookTown.Repository;

import com.example.BookTown.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long>  {

    List<Book> findAllByAmountGreaterThanOrderByPriceDesc(int amount);
    Book findByIdAndAmountGreaterThan(Long id, int amount);

}
