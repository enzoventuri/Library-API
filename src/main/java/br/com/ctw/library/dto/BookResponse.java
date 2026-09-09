package br.com.ctw.library.dto;

import java.util.Set;
import java.util.UUID;

public record BookResponse(
        UUID id,
        String title,
        PublisherResponse publisher,
        Set<String> authors
) {
}