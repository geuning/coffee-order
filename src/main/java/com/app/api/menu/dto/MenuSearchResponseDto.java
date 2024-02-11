package com.app.api.menu.dto;

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

}
