package com.agungdh.line_be.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RichMenuArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private RichMenu richMenu;
    @OneToOne
    private RichMenuAreaBound bound;
    @OneToOne
    private RichMenuAreaAction action;
}
