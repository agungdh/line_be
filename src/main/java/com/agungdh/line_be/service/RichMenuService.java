package com.agungdh.line_be.service;

import com.agungdh.line_be.entity.RichMenu;
import com.agungdh.line_be.repository.RichMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RichMenuService {
    private final RichMenuRepository richMenuRepository;

    public List<RichMenu> findAll() {
        return richMenuRepository.findAll();
    }

    public RichMenu save(RichMenu richMenu) {
        return richMenuRepository.save(richMenu);
    }

    public RichMenu findById(Long id) {
        return richMenuRepository.findById(id).orElseThrow();
    }
}
