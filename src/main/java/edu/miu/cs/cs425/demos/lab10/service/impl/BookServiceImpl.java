package edu.miu.cs.cs425.demos.lab10.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.miu.cs.cs425.demos.lab10.service.BookService;
import edu.miu.cs.cs425.demos.lab10.model.Book;
import edu.miu.cs.cs425.demos.lab10.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	public BookServiceImpl (BookRepository bookRep) {
		this.bookRepository= bookRep;
		
	}
	

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
