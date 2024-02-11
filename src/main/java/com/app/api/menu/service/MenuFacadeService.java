package com.app.api.menu.service;

import com.app.api.menu.dto.MenuSearchResponseDto;
import com.app.domain.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuFacadeService {
    private final MenuService menuService;

    public List<MenuSearchResponseDto> searchMenu(){
        return null;
    }


}
