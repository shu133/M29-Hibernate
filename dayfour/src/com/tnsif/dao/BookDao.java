package com.tnsif.dao;
import java.util.List;
import com.tnsif.entities.Book;
public interface BookDao {
	//abstract by default
	Book getBookByID(int id);//single entity
	List<Book>getAllBooks();//all the book
	Long getBookCount();//count
	List<Book>getAutherBooks(String author);//particular author
	List<Book>getBookByTitle(String title);//for particular title
	List<Book>getBookByPrice(double low,double high);//price range
	List<Book> getAuthorBooks(String author);
}
