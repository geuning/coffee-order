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
@Table(name = "`point`")
public class Point extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private Long pointId;

    @Column(name ="point_type", nullable = false, length = 10)
    private String pointType;

    @Column(name = "point", nullable = false)
    private Long point;

    @Column(name = "before_point", nullable = false)
    private Long beforePoint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @Builder
    public Point(Long pointId, String pointType, Long point, Long beforePoint, Member member){
        this.pointId = pointId;
        this.pointType = pointType;
        this.point = point;
        this.beforePoint = beforePoint;
        this.member = member;
    }



}
