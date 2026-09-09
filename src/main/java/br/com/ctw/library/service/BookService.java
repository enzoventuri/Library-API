package br.com.ctw.library.service;

import br.com.ctw.library.dto.BookResponse;
import br.com.ctw.library.entity.Book;
import br.com.ctw.library.mapper.BookMapper;
import br.com.ctw.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class BookService {
    private BookMapper mapper;
    private BookRepository repository;

    public BookService(BookMapper mapper, BookRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public Set<BookResponse> getAllBooks() {
        Set<Book> books = repository.readAllBy();

        return mapper.toResponseSet(books);
    }

    public Set<BookResponse> getBooksFromId(UUID id) {
        Set<Book> books = repository.readAllById(id);

        return mapper.toResponseSet(books);
    }

    public Set<BookResponse> getBooksFromSimilarName(String title) {
        Set<Book> books = repository.readBooksByTitleContainingIgnoreCase(title);

        return mapper.toResponseSet(books);
    }

}
