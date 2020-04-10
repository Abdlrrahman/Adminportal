package com.adminportal.service;

import com.adminportal.domain.Book;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book save(Book book);

}
