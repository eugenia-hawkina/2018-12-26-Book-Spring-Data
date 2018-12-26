package telran.ashkelon2018.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.ashkelon2018.books.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {

}
