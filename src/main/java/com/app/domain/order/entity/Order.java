package com.app.domain.order.entity;

import com.app.domain.common.BaseTimeEntity;
import com.app.domain.member.entity.Member;
import com.app.domain.menu.entity.Menu;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`order`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_price", nullable = false)
    private Long orderPrice;

    @Column(name = "order_quantity", nullable = false)
    private Long orderQuantity;

    @Column(name = "menu_name", nullable = false, length = 50)
    private String menuName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Menu menu;


    @Builder
    public Order(Long orderId, Long orderPrice, Long orderQuantity, String menuName, Member member, Menu menu){
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.orderQuantity = orderQuantity;
        this.menuName = menuName;
        this.member = member;
        this.menu = menu;
    }



}
