package br.com.ctw.library.dto;

import java.util.UUID;

public record ReviewRequest(
        String comment,
        UUID idBook
) {
}
