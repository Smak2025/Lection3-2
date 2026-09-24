package ru.gr0550x.ui;

import java.time.LocalDateTime;
import java.util.UUID;

public record Note(
    UUID id,
    String text,
    LocalDateTime createdAt
){}
