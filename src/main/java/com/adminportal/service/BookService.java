package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Book;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book save(Book book);

    List<Book> findAll();

}
