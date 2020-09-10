package com.example.demo.service;

import com.example.demo.bean.BookBean;

import java.util.List;

/**
 * @author wj
 * @version 1.0
 * @date 2020/9/6 14:54
 */
public interface BookService {

    //新增图书
    int bookinsert(BookBean book);

    //修改图书信息
    int bookupdate(BookBean book);

    //根据根据id删除图书
    int bookdelete(int id);

    //查找图书信息
    BookBean bookselect(int id);

    //查找所有图书信息
    List<BookBean> allbookselect();


}
