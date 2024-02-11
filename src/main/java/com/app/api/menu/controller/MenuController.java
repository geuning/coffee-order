package com.app.api.menu.controller;

import com.app.api.menu.dto.MenuSearchResponseDto;
import com.app.api.menu.service.MenuFacadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final MenuFacadeService menuFacadeService;

    @GetMapping("/search-all")
    public ResponseEntity<List<MenuSearchResponseDto>> searchAllMenu(){
        List<MenuSearchResponseDto> menuSearchResponseDtos = menuFacadeService.searchAllMenu();
        return ResponseEntity.ok(menuSearchResponseDtos);
    }
}
