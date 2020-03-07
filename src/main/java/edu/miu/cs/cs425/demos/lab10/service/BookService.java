package edu.miu.cs.cs425.demos.lab10.service;

import java.util.List;

import edu.miu.cs.cs425.demos.lab10.model.Book;

public interface BookService {
	
	List<Book> getBooks();
	Book saveBook(Book book);

}
