package com.agungdh.line_be.service;

import com.agungdh.line_be.dto.RichMenuCreateRequest;
import com.agungdh.line_be.dto.RichMenuCreateResponse;
import com.agungdh.line_be.dto.RichMenuSizeDTO;
import com.agungdh.line_be.entity.RichMenu;
import com.agungdh.line_be.entity.RichMenuSize;
import com.agungdh.line_be.repository.RichMenuRepository;
import com.agungdh.line_be.repository.RichMenuSizeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RichMenuService {
    private final RichMenuRepository richMenuRepository;
    private final RichMenuSizeRepository richMenuSizeRepository;

    public List<RichMenu> findAll() {
        return richMenuRepository.findAll();
    }

    @Transactional
    public RichMenuCreateResponse create(RichMenuCreateRequest richMenuCreateRequest) {
        RichMenuSize richMenuSize = new RichMenuSize();
        richMenuSize.setWidth(richMenuCreateRequest.size().width());
        richMenuSize.setHeight(richMenuCreateRequest.size().height());
        richMenuSizeRepository.save(richMenuSize);

        RichMenu richMenu = new RichMenu();
        richMenu.setSize(richMenuSize);
        richMenu.setSelected(richMenuCreateRequest.selected());
        richMenu.setName(richMenuCreateRequest.name());
        richMenu.setChatBarText(richMenuCreateRequest.chatBarText());
        richMenu.setCreatedAt(Instant.now());

        richMenuRepository.save(richMenu);

        return new RichMenuCreateResponse(
                richMenu.getId(),
                richMenu.getRichMenuId(),
                new RichMenuSizeDTO(
                        richMenu.getSize().getWidth(),
                        richMenu.getSize().getHeight()
                ),
                richMenu.isSelected(),
                richMenu.getName(),
                richMenu.getChatBarText(),
                richMenu.getCreatedAt(),
                richMenu.getLastSyncedAt()
        );
    }

    public RichMenu findById(Long id) {
        return richMenuRepository.findById(id).orElseThrow();
    }
}
