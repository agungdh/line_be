package com.agungdh.line_be.dto;

public record RichMenuCreateRequest (
        RichMenuSize size,
        boolean selected,
        String name,
        String chatBarText
) { }
