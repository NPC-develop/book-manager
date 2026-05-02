package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")   // ✅ 统一基础路径
public class BookController {

    @Autowired
    private BookService bookService;

    // 查询所有：GET /api/books
    @GetMapping
    public List<Book> list() {
        return bookService.findAll();
    }

    // 查询单个：GET /api/books/1
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    // 新增：POST /api/books
    @PostMapping
    public int add(@RequestBody Book book) {
        return bookService.insert(book);
    }

    // 修改：PUT /api/books
    @PutMapping
    public int update(@RequestBody Book book) {
        return bookService.update(book);
    }

    // 删除：DELETE /api/books/1
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return bookService.deleteById(id);
    }

    // 测试接口：GET /api/books/test
    @GetMapping("/test")
    public String test() {
        return "ok";
    }
}