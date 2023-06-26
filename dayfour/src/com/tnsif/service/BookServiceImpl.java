package com.tnsif.service;

import java.util.List;

import com.tnsif.dao.BookDao;
import com.tnsif.dao.BookDaoImpl;
import com.tnsif.entities.Book;

public class BookServiceImpl implements BookService{
private BookDao dao;
	
	public BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookByID(int id) {
		
		return dao.getBookByID(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByPrice(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}

}
