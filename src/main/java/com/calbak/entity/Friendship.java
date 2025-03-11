package com.calbak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "friendship", schema = "public")
public class Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "friendship_id", nullable = false, length = 30)
    private String friendshipId; // 친구 ID

    @Column(name = "user_id", nullable = false, length = 30)
    private String userId;

    @Column(name = "friend_id", nullable = false, length = 30)
    private String friendId;

    @CreationTimestamp
    @Column(name = "create_dt", nullable = false)
    private LocalDateTime createDt; // 데이터 생성 일자

    @Column(name = "create_user", nullable = false, length = 30)
    private String createUser; // 데이터 생성자

    @UpdateTimestamp
    @Column(name = "update_dt", nullable = false)
    private LocalDateTime updateDt; // 데이터 수정일

    @Column(name = "update_user", nullable = false, length = 30)
    private String updateUser; // 데이터 수정자
}
