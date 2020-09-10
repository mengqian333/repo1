package com.example.demo.bean;

/**
 * @author wj
 * @version 1.0
 * @date 2020/9/6 14:48
 */
public class BookBean {

    private Integer book_id;
    private String book_name;
    private String book_author;
    private double  book_price;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_autor='" + book_author + '\'' +
                ", book_price=" + book_price +
                '}';
    }
}
