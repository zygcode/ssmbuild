/**
 * Copyright (C), 2021-2021, ZYG
 * History
 * <author>   <create>   <version>   <desc>
 * 作者姓名    修改时间      版本号    功能描述
 */
package com.zyg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Books
 * 功能描述：
 * @Author Inno
 * @Create 2021/4/23 14:39
 * @Version 1.0.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
