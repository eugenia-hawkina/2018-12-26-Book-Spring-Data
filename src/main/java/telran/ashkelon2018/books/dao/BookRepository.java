package telran.ashkelon2018.books.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.ashkelon2018.books.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	Stream<Book> findByAuthorsName(String name);

	Stream<Book> findByPublisherPublisherName(String name);

	@Query (value = "SELECT DISTINCT p.publisher_name FROM book b "
			+ "JOIN publisher p ON b.publisher_publisher_name = p.publisher_name "
			+ "JOIN book_authors a ON a.books_isbn = b.isbn "
			+ "WHERE a.authors_name = ?1", nativeQuery = true)
	Iterable<String> findAllPublisherByAuthorsName(String name);
}
