package br.com.ctw.library.dto;

import br.com.ctw.library.entity.Book;

import java.util.Set;
import java.util.UUID;

public record AuthorResponse(
        UUID id,
        String name,
        Set<BookResponse> books
) {
}
