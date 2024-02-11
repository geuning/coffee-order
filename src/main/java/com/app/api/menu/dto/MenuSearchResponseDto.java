package com.app.api.menu.dto;

import com.app.domain.menu.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuSearchResponseDto {

    private Long menuId;
    private String menuName;
    private Long menuPrice;

    public static MenuSearchResponseDto toDto(Menu menu){
        return MenuSearchResponseDto.builder()
                .menuId(menu.getMenuId())
                .menuName(menu.getMenuName())
                .menuPrice(menu.getMenuPrice())
                .build();
    }

}
