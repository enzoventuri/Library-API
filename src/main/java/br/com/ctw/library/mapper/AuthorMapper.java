package br.com.ctw.library.mapper;

import br.com.ctw.library.dto.AuthorRequest;
import br.com.ctw.library.dto.AuthorResponse;
import br.com.ctw.library.dto.BookResponse;
import br.com.ctw.library.dto.PublisherResponse;
import br.com.ctw.library.entity.Author;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

//@Component
//public class AuthorMapper {
//    public Author toEntity(AuthorRequest request) {
//        if (request == null) {
//            return null;
//        }
//
//        return Author.builder()
//                .name(request.name())
//                .build();
//    }
//
//    public AuthorResponse toResponse(Author entity) {
//        Set<BookResponse> booksResponse = entity.getBooks().stream()
//                .map(b -> new BookResponse(b.getId(), b.getTitle(), new PublisherResponse(b.getPublisher()
//                        .getId(), b.getPublisher().getName())))
//                .collect(Collectors.toSet());
//
//        return new AuthorResponse(
//                entity.getId(),
//                entity.getName(),
//                booksResponse
//        );
//    }
//}
