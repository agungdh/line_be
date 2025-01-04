package com.agungdh.line_be.controller;

import com.agungdh.line_be.dto.RichMenuCreateRequest;
import com.agungdh.line_be.dto.RichMenuCreateResponse;
import com.agungdh.line_be.entity.RichMenu;
import com.agungdh.line_be.entity.RichMenuSize;
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
    public RichMenuCreateResponse save(@RequestBody RichMenuCreateRequest richMenuCreateRequest) {
        return richMenuService.create(richMenuCreateRequest);
    }

    @GetMapping("/{id}")
    public RichMenu sync(@PathVariable Long id) {
     RichMenu richMenu = richMenuService.findById(id);

     richMenu.setLastSyncedAt(Instant.now());

     return richMenu;
    }
}
