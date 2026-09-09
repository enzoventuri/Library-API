package br.com.ctw.library.mapper;

import br.com.ctw.library.dto.BookRequest;
import br.com.ctw.library.dto.BookResponse;
import br.com.ctw.library.dto.PublisherResponse;
import br.com.ctw.library.entity.Author;
import br.com.ctw.library.entity.Book;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BookMapper {
    public Book toEntity(BookRequest request) {
        if (request == null) {
            return null;
        }

        return Book.builder()
                .title(request.title())
                .review(request.review())
                .build();
    }

    public BookResponse toResponse(Book entity) {
        return new BookResponse(
                entity.getId(),
                entity.getTitle(),
                new PublisherResponse(entity.getPublisher().getId(), entity.getPublisher().getName()),
                entity.getAuthors().stream().map(Author::getName).collect(Collectors.toSet())
        );
    }

    public Set<BookResponse> toResponseSet(Set<Book> books) {
        return books.stream().map(this::toResponse).collect(Collectors.toSet());
    }

}
