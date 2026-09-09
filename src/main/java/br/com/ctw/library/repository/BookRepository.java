package br.com.ctw.library.repository;

import br.com.ctw.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    Set<Book> readAllBy();
    Set<Book> readAllById(UUID id);
    Set<Book> readBooksByTitleContainingIgnoreCase(String title);
}
