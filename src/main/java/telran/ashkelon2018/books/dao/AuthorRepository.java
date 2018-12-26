package telran.ashkelon2018.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.ashkelon2018.books.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
