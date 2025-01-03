package com.agungdh.line_be.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RichMenuAreaAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String label;
    private String data;
    private String mode;
    private String initial;
    private String max;
    private String min;
    private String richMenuAliasId;
    private String clipboardText;
    private String displayText;
    private String text;
    private String inputOption;
    private String fillInText;
    private String uri;
    private String altUriDesktop;
}
