package com.app.domain.member.entity;

import com.app.domain.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "`member`")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "member_name", nullable = false, length = 100)
    private String memberName;

    @Column(name = "member_point", nullable = false)
    private Long memberPoint;

    @Builder
    public Member(Long memberId, String memberName, Long memberPoint){
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPoint = memberPoint;
    }


}
