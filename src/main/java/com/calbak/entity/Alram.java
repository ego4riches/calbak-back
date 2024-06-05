package com.calbak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "alram", schema = "alram")
public class Alram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "user_id", nullable = false, length = 30)
    private String userId;

    @Column(name = "type", nullable = false)
    private String type; // 친구 요청 OR 일정 요청

    @Column(name = "request_id")
    private String requestId; // 일정 OR 친구 요청 ID

    @Column(name = "title", nullable = false)
    private String title; // 알람 제목

    @Column(name = "content", nullable = false)
    private String content; // 알람 내용

    @Column(name = "status", nullable = false)
    private String status; // 알람 상태

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
