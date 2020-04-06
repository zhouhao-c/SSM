package com.zh.service;

import com.zh.pojo.Books;

import java.util.List;


public interface BookService {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(int id);
    //更新
    int updateBook(Books books);
    //查询一本
    Books queryBookById(int id);
    //查询所有
    List<Books> queryAllBook();
}
