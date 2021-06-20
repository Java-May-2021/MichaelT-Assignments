package com.Michael.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Michael.books.models.Book;
import com.Michael.books.repositories.BookRepository;
@Service
public class BookService {
	 // adding the book repository as a dependency
	private final BookRepository bookRepository;
	 
	public BookService(BookRepository bookRepository) {
	    this.bookRepository = bookRepository;
	 }
	 // returns all the books
	public List<Book> allBooks() {
	    return this.bookRepository.findAll();
	 }
	 // creates a book
	public Book createBook(Book b) {
	    return this.bookRepository.save(b);
	 }
	 // retrieves a book
	public Book findBook(Long id) {
	     return this.bookRepository.findById(id).orElse(null);
	 }
}
