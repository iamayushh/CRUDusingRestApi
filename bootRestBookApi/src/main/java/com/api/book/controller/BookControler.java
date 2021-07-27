package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.dataService.BookService;
import com.api.book.modelClases.Book;

@RestController
public class BookControler {
@Autowired
	private BookService bookService;
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	
	@GetMapping("/books") 
	//@ResponseBody  //ResponseBodyKo likhne se jo return karaya hai vhi chala jaega page nhi
//	public List<Book> getBooks()
//	{
//		 return bookService.getAllBooks();
//		//return "this is testing book first";
//	}
	//Handeling Above method using Response ENTITY
	
	public ResponseEntity<List<Book>> getBooks()
	{
		 List <Book> list =bookService.getAllBooks();
		 if(list.size()<=0)
		 {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 return ResponseEntity.of(Optional.of(list));
		//return "this is testing book first";
	}

	
	
	

	@GetMapping("/book/{id}") 
	public Book getBook(@PathVariable("id") int id)
	{
		 return bookService.getBookById(id);
		//return "this is testing book first"; 
	}
	
	
	
	
	/* Post Api */
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
	   Book b=  this.bookService.addBook(book);
	  return b;
	}
	
	//Delete API
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId)
	{
		this.bookService.deleteBook(bookId);
	}
	
	
	//Update Book Handler
	
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId )
	{
		this.bookService.updateBook(book,bookId);
		return book;
	}
}
