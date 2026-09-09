package br.com.ctw.library.dto;

import br.com.ctw.library.entity.Review;

import java.util.UUID;

public record BookRequest(
        String title,
        Review review,
        UUID idPublisher
) {
}