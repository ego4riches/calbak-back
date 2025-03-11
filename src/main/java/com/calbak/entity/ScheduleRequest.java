package com.calbak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "schedule_request", schema = "public")
public class ScheduleRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "schedule_id", nullable = false)
    private String scheduleId; // 일정 ID

//    @Column(name = "from_user_id", nullable = false, length = 30)
//    private String fromUserId; // 요청자 ID

    @Column(name = "to_user_id", nullable = false, length = 30)
    private String toUserId; // 요청 대상자 ID

    @Column(name = "status")
    private String status; // 요청 상태

    @Column(name = "response_message")
    private String responseMessage; // 응답 메시지

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
