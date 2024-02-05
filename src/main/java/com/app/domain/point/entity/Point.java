package com.app.domain.point.entity;

import com.app.domain.common.BaseEntity;
import com.app.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "POINT")
public class Point extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pointId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Long point;

    @Column(nullable = false)
    private Long beforePoint;

    @Column(nullable = false)
    private Long afterPoint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @Builder
    public Point(Long pointId, String type, Long point, Long beforePoint, Long afterPoint, Member member){
        this.pointId = pointId;
        this.type = type;
        this.point = point;
        this.beforePoint = beforePoint;
        this.afterPoint = afterPoint;
        this.member = member;
    }



}
