package com.calbak.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment", schema = "schedule")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "schedule_id", nullable = false)
    private String scheduleId; // 일정 ID

    @Column(name = "user_id", nullable = false, length = 30)
    private String userId; // 사용자 ID

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "status", nullable = false)
    private String status; // 댓글 상태

    @Column(name = "create_dt", nullable = false)
    private LocalDateTime createDt; // 데이터 생성 일자

    @Column(name = "create_user", nullable = false, length = 30)
    private String createUser; // 데이터 생성자

    @Column(name = "update_dt", nullable = false)
    private LocalDateTime updateDt; // 데이터 수정일

    @Column(name = "update_user", nullable = false, length = 30)
    private String updateUser; // 데이터 수정자

    @Column(name = "delete_dt")
    private LocalDateTime deleteDt; // 데이터 삭제 일자

    @Column(name = "delete_user", length = 30)
    private String deleteUser; // 데이터 삭제자

}
