package com.agungdh.line_be.dto;

import java.time.Instant;

public record RichMenuCreateResponse (
        Long id,
        String richMenuId,
        RichMenuSizeDTO size,
        boolean selected,
        String name,
        String chatBarText,
        Instant createdAt,
        Instant lastSyncedAt
) {
}
