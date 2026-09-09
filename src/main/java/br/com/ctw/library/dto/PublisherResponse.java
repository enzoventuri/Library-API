package br.com.ctw.library.dto;

import java.util.UUID;

public record PublisherResponse(
        UUID id,
        String name
) {
}
