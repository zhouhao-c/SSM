package com.zh.dao;

import com.zh.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("book_id") int id);
    //更新
    int updateBook(Books books);
    //查询一本
    Books queryBookById(@Param("book_id") int id);
    //查询所有
    List<Books> queryAllBook();
}
