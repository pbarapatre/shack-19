package com.shack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shack.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
