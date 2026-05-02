package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }

    @Transactional
    public int insert(Book book) {
        return bookMapper.insert(book);
    }

    @Transactional
    public int update(Book book) {
        return bookMapper.update(book);
    }

    @Transactional
    public int deleteById(Integer id) {
        return bookMapper.deleteById(id);
    }
}