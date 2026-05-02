package com.example.demo.mapper;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT * FROM book")
    List<Book> findAll();

    @Select("SELECT * FROM book WHERE id = #{id}")
    Book findById(Integer id);

    @Insert("INSERT INTO book(name, author, price, stock) VALUES(#{name}, #{author}, #{price}, #{stock})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Book book);

    @Update("UPDATE book SET name=#{name}, author=#{author}, price=#{price}, stock=#{stock} WHERE id=#{id}")
    int update(Book book);

    @Delete("DELETE FROM book WHERE id = #{id}")
    int deleteById(Integer id);
}