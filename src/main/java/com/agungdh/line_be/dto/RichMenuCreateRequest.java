package com.agungdh.line_be.dto;

public record RichMenuCreateRequest (
        RichMenuSizeDTO size,
        boolean selected,
        String name,
        String chatBarText
) { }
