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
import org.springframework.web.bind.annotation.RequestMapping;

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


}
