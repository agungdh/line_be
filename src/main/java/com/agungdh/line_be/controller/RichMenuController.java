package com.agungdh.line_be.controller;

import com.agungdh.line_be.dto.RichMenuCreateRequest;
import com.agungdh.line_be.entity.RichMenu;
import com.agungdh.line_be.service.RichMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/richmenu")
@RequiredArgsConstructor
public class RichMenuController {
    private final RichMenuService richMenuService;

    @GetMapping
    public List<RichMenu> findAll() {
        return richMenuService.findAll();
    }

    @PostMapping
    public RichMenu save(RichMenuCreateRequest richMenuCreateRequest) {
        RichMenu richMenu = new RichMenu();
//        richMenu.setTitle(richMenuCreateRequest.title());
//        richMenu.setDescription(richMenuCreateRequest.description());
//        richMenu.setCreatedAt(Instant.now());
        return richMenuService.save(richMenu);
    }

    @GetMapping("/{id}")
    public RichMenu sync(@PathVariable Long id) {
     RichMenu richMenu = richMenuService.findById(id);

     richMenu.setLastSyncedAt(Instant.now());

     return richMenu;
    }
}
