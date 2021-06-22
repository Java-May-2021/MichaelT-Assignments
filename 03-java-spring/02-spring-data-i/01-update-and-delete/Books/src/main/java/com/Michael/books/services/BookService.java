package com.Michael.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Michael.books.models.Book;
import com.Michael.books.repositories.BookRepository;
@Service
public class BookService {
	
	private final BookRepository bookRepository;
	 
	public BookService(BookRepository bookRepository) {
	    this.bookRepository = bookRepository;
	 }
	
	public List<Book> allBooks() {
	    return this.bookRepository.findAll();
	 }
	
	public Book createBook(Book book) {
	    return this.bookRepository.save(book);
	 }
	
	public Book findBook(Long id) {
	     return this.bookRepository.findById(id).orElse(null);
	 }
	
    public Book updateBook(Book book) {
    	return this.bookRepository.save(book);
    }
    
    public void deleteBook(Long id) {
    	this.bookRepository.deleteById(id);
    }
}
