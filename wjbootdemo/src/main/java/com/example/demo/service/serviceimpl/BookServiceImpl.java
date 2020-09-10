package com.example.demo.service.serviceimpl;

import com.example.demo.bean.BookBean;
import com.example.demo.dao.BookDao;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wj
 * @version 1.0
 * @date 2020/9/6 16:31
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    //新增图书
    @Override
    public int bookinsert(BookBean book) {
        return bookDao.insert(book);
    }

    //修改图书信息
    @Override
    public int bookupdate(BookBean book) {
        return bookDao.update(book);
    }

    //根据id删除图书
    @Override
    public int bookdelete(int id) {
        return bookDao.delect(id);
    }

    //查找图书信息
    @Override
    public BookBean bookselect(int id) {
        return bookDao.select(id);
    }

    //查找所有图书信息
    @Override
    public List<BookBean> allbookselect() {
        return bookDao.selectall();
    }
}
