package br.com.ctw.library.dto;

import java.util.Set;
import java.util.UUID;

public record PublisherRequest(
        String name,
        Set<UUID> idBooks
) {
}
