package com.agungdh.line_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RichMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String richMenuId;
    @OneToOne
    @JoinColumn(name = "size_id")
    private RichMenuSize size;
    private boolean selected;
    private String name;
    private String chatBarText;
    private Instant createdAt;
    private Instant lastSyncedAt;
}
