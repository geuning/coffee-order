package com.app.domain.member.entity;

import com.app.domain.common.BaseEntity;
import com.app.domain.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "`MEMBER`")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, length = 100)
    private String memberName;

    @Column(nullable = false)
    private Long memberPoint;

    @Builder
    public Member(Long memberId, String memberName, Long memberPoint){
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPoint = memberPoint;
    }


}
