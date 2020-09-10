package com.example.demo.Controller;

import com.example.demo.bean.BookBean;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author wj
 * @version 1.0
 * @date 2020/9/6 14:52
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

   /*
   添加图书
    */
   @ResponseBody
    @RequestMapping("/books")
    public String addBook(BookBean book){
        System.out.println(book);
        int i= bookService.bookinsert(book);
        if(i==1) return "true";
        else return "false";
    }

    //根据id删除图书
    @RequestMapping("/books/delect")
    public String deletebook(int id) {
       int i= bookService.bookdelete(id);
       if(i==1) return "true";
        else return "false";
    }

    //修改图书信息
    @RequestMapping("/books/update")
    public String updatebook(BookBean book){
      int i= bookService.bookupdate(book);
        if(i==1) return "true";
        else return "false";
    }

    //查找图书信息
    @ResponseBody
    @GetMapping("/books/{id}")
    public BookBean getbooks(@PathVariable("id") int id){
        BookBean book=  bookService.bookselect(id);
        System.out.println(book);
        return book;
    }

    //获取图书馆所有图书信息
    @ResponseBody
    @RequestMapping("/allbooks")
    public List<BookBean> getallbooks() {
        List<BookBean> list = bookService.allbookselect();
        return list;
    }
}
