/**
 * Copyright (C), 2021-2021, ZYG
 * History
 * <author>   <create>   <version>   <desc>
 * 作者姓名    修改时间      版本号    功能描述
 */
package com.zyg.controller;

import com.zyg.entity.Books;
import com.zyg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookController
 * 功能描述：
 * @Author Inno
 * @Create 2021/4/23 17:15
 * @Version 1.0.0
 */

@Controller
@RequestMapping("/book")
public class BookController {

    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的数据，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String bookList(ModelMap modelMap) {
        List<Books> books = bookService.queryAllBook();
        modelMap.addAttribute("list", books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    //添加数据的请求
    @RequestMapping("addBook")
    public String addBook(Books books) {
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到@RequestMapping("/allBook")请求
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, ModelMap modelMap) {
        Books books = bookService.queryBookById(id);
        modelMap.addAttribute("QBook", books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        System.out.println("updateBook => " + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, ModelMap modelMap) {
        Books books = bookService.queryBookByName(queryBookName);

        List<Books> list = new ArrayList<Books>();
        list.add(books);

        if(books == null) {
            System.out.println("execute here!");
            list = bookService.queryAllBook();
            modelMap.addAttribute("error", "未查到");
        }

        modelMap.addAttribute("list", list);
        return "allBook";
    }



}
