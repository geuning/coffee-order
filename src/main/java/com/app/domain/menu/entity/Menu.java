package com.app.domain.menu.entity;

import com.app.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MENU")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;

    @Column(nullable = false)

    private String menuName;
    @Column(nullable = false)
    private Long price;

    @Builder
    public Menu(Long menuId, String menuName, Long price){
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
    }

}
