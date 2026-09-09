package br.com.ctw.library.controller;

import br.com.ctw.library.dto.BookResponse;
import br.com.ctw.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public Set<BookResponse> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Set<BookResponse> getBooksFromId(@PathVariable UUID id) {
        return service.getBooksFromId(id);
    }

    @GetMapping(params = "title")
    public Set<BookResponse> getBooksFromSimilarName(@RequestParam String title) {
        return service.getBooksFromSimilarName(title);
    }

}
