package telran.ashkelon2018.books.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {
	Long isbn;
	String title;
	@Singular
	Set<AuthorDto> authors;
	String publisher;

}
