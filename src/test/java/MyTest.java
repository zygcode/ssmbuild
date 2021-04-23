/**
 * Copyright (C), 2021-2021, ZYG
 * History
 * <author>   <create>   <version>   <desc>
 * 作者姓名    修改时间      版本号    功能描述
 */

import com.zyg.entity.Books;
import com.zyg.service.BookService;
import com.zyg.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName MyTest
 * 功能描述：
 * @Author Inno
 * @Create 2021/4/23 17:46
 * @Version 1.0.0
 */
public class MyTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);

        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
