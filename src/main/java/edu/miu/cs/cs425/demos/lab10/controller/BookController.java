package edu.miu.cs.cs425.demos.lab10.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import edu.miu.cs.cs425.demos.lab10.model.Book;
import edu.miu.cs.cs425.demos.lab10.service.BookService;

@Controller
public class BookController {
	

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService= bookService;
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value = "/book/list")
	// @RequestMapping(value= "/book/list", method = RequestMethod.GET)
	// introduce in spring 5 and later ModelAndView
	public ModelAndView listBooks() {
		ModelAndView modelAndView = new ModelAndView();
		List<Book> books = bookService.getBooks();
		modelAndView.addObject("books", books);
		modelAndView.addObject("booksCount", books.size());
		modelAndView.setViewName("book/list");
		return modelAndView;

	}
	
	@GetMapping(value="/book/new")
	public String displayAddNewBookForm(Model model)
	{
		model.addAttribute("book", new Book());
	
		return "book/new";
	}
	
//	public String listbook2(Model model)
//	{
//		List<Book> books = bookService.getBooks();
//		model.addAllAttributes(books);
//		return model;
//		
//	}

}
