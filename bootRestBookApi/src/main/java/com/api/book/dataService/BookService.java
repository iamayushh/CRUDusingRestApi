package com.api.book.dataService;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.book.modelClases.Book;
@Component
public class BookService {
private static List<Book> list=new ArrayList<>();

static {
//	list.add(new Book(101,"Core Java Volume I – Fundamentals","Cay S. Horstmann"));
//	list.add(new Book(102,"Effective Java","Joshua Bloch"));
//	list.add(new Book(103,"Java: A Beginner’s Guide"," Herbert Schildt   "));
//	list.add(new Book(104,"Java - The Complete Reference"," Herbert Schildt\n"));
//	list.add(new Book(105," Head First Java ","  Kathy Sierra & Bert Bates "));
//	list.add(new Book(106,"  Java Concurrency in Practice "," Brian Goetz with Tim Peierls  "));
//	list.add(new Book(107,"  Test-Driven: TDD and Acceptance TDD for Java Developers  ","  Lasse Koskela   "));
//	list.add(new Book(108,"  Head First Object-Oriented Analysis Design      ","   Brett D. McLaughlin, Gary Pollice & David West "));
	}


//Get all Books

public List<Book> getAllBooks()
{
	return list;
}


//To return Single Book by ID

public Book getBookById(int id)
{
	/*Ab yha pe Ya to binarY sEARCH LGA SKTE HAI
	LEKIN yha pe stream api use krenge
	Stream API->kOI BHI ELEMENT KO KISI cOLLECTION MHH SEARCH KARNE KE KAM ATI HAI
	
	*/
	
	Book book=list.stream().filter(e->e.getId()==id).findFirst().get();
	return book;
	

}
//To add the book
public Book addBook(Book b)
{
	list.add(b);
	return b;
}


//to delete the book
public void deleteBook(int bid)
{
	list=list.stream().filter(book->{
		if(book.getId()!=bid)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}).collect(Collectors.toList());
}

//Update the Book

public void updateBook(Book book,int bookId)
{
	list.stream().map(b->{
		if(b.getId()==bookId)
		{
			b.setTitle(book.getTitle());
			b.setAuthor(book.getAuthor());
		}
		return b;
	}).collect(Collectors.toList());
}

}
