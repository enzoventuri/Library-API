package br.com.ctw.library.dto;

import java.util.Set;
import java.util.UUID;

public record AuthorRequest(
        String name,
        Set<UUID> idBooks
) {
}
