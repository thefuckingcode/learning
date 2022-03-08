package org.example.service;

import org.example.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {

    @Resource(name = "bookDao2")
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }
}
