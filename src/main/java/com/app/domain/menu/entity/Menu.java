package com.app.domain.menu.entity;

import com.app.domain.common.BaseEntity;
import com.app.domain.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`MENU`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;

    @Column(nullable = false, length = 50)
    private String menuName;

    @Column(nullable = false)
    private Long menuPrice;

    @Builder
    public Menu(Long menuId, String menuName, Long menuPrice){
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

}
