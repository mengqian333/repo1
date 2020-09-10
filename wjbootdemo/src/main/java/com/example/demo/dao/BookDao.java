package com.example.demo.dao;

import com.example.demo.bean.BookBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wj
 * @version 1.0
 * @date 2020/9/6 16:32
 */

@Mapper
public interface BookDao {

    //根据id查找图书
    BookBean select(int id);

    //查找所有图书
    List<BookBean> selectall();

    //修改图书信息
    int update(BookBean book);

    //新增图书
    int insert(BookBean book);

    //根据ID删除图书
    int delect(int id);
}
