package br.com.ctw.library.dto;

import java.util.UUID;

public record ReviewResponse(
        UUID id,
        String comment,
        BookResponse book
) {
}
