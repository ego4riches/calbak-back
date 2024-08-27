package com.calbak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "schedule_info", schema = "schedule")
public class ScheduleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "schedule_id", nullable = false)
    private String scheduleId; // 일정 ID

    @Column(name = "place")
    private String place;   // 약속 장소

    @Column(name = "title", nullable = false, length = 100)
    private String title; // 일정 제목

    @Column(name = "message")
    private String message; // 요청 메시지

    @Column(name = "start_dt", nullable = false)
    private LocalDateTime startDt; // 시작 일자

    @Column(name = "end_dt", nullable = false)
    private LocalDateTime endDt; // 종료 일자

    @Column(name = "from_user_id", nullable = false, length = 30)
    private String formUserId; // 요청자 ID

//    @Column(name = "to_count")
//    private Integer toCount; // 요청 대상자 수 => 요청 대상자 수는 요청 정보에서 가져오는 것이 적절함

//    @Column(name = "ok_count")
//    private Integer okCount; // 수락 수 => 수락 수는 요청 정보에서 가져오는 것이 적절함

//    @Column(name = "no_count")
//    private Integer noCount; // 거절 수 => 거절 수는 요청 정보에서 가져오는 것이 적절함

//    @Column(name = "status")
//    private String status; // 일정 상태 => 일정 상태는 요청 정보에서 가져오는 것이 적절함 (대기|부분 수락|수락|전체 거절)

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
