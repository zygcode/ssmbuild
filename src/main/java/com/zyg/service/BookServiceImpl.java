/**
 * Copyright (C), 2021-2021, ZYG
 * History
 * <author>   <create>   <version>   <desc>
 * 作者姓名    修改时间      版本号    功能描述
 */
package com.zyg.service;

import com.zyg.dao.BookMapper;
import com.zyg.entity.Books;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * 功能描述：
 * @Author Inno
 * @Create 2021/4/23 14:56
 * @Version 1.0.0
 */
public class BookServiceImpl implements BookService {

    //service调dao层：组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
