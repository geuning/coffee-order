package com.app.api.menu.service;

import com.app.api.menu.dto.MenuSearchResponseDto;
import com.app.domain.menu.entity.Menu;
import com.app.domain.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MenuFacadeService {
    private final MenuService menuService;

    public List<MenuSearchResponseDto> searchAllMenu(){
        List<Menu> menuList = menuService.searchAllMenu();
        return menuList.stream().map(MenuSearchResponseDto::toDto).collect(Collectors.toList());
    }


}
