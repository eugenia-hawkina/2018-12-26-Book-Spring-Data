package telran.ashkelon2018.books.service;

import telran.ashkelon2018.books.dto.AuthorDto;
import telran.ashkelon2018.books.dto.BookDto;

public interface BookService {
	
	boolean addBook(BookDto bookDto);
	
	BookDto removeBook(Long isbn);
	
	BookDto getBookByIsbn(Long isbn);
	
	Iterable<BookDto> getBooksByAuthor(String authorName);
	
	Iterable<BookDto> getBooksByPublisher(String publisherName);
	
	Iterable<AuthorDto> getBookAuthors(Long isbn);
	
	Iterable<String> getPublishersByAuthor(String authorName);
	
	

}
