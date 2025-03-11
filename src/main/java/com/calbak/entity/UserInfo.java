package com.calbak.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_info", schema = "public")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 데이터 ID

    @Column(name = "login_id", nullable = false, length = 30)
    private String loginId;

    @Column(name = "login_password", nullable = false, length = 30)
    private String loginPassword;

    @Column(name = "nickname", nullable = false, length = 30)
    private String nickname;

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
