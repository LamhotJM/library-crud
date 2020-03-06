package edu.miu.cs.cs425.demos.lab10.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name ="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookId;
	@NotBlank(message= "* Title Required")
	private String isbn;
	@NotBlank(message= "* ISBN Required")
	private String title;
	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getOverdueFee() {
		return overdueFee;
	}

	public void setOverdueFee(Double overdueFee) {
		this.overdueFee = overdueFee;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	public Book(String isbn, String title, Double overdueFee, String publisher, LocalDate datePublished) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.overdueFee = overdueFee;
		this.publisher = publisher;
		this.datePublished = datePublished;
	}

	public Book(Integer bookId, String isbn, String title, Double overdueFee, String publisher,
			LocalDate datePublished) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.title = title;
		this.overdueFee = overdueFee;
		this.publisher = publisher;
		this.datePublished = datePublished;
	}

	private Double overdueFee;
	private String publisher;
	private LocalDate datePublished;

	public Book() {
		// TODO Auto-generated constructor stub
	}

}
