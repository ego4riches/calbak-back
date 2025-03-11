package com.calbak.domain.alarm;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("notifications")
@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "5. 알림 Controller", description = "알림 API")
public class NotificationController {

    @GetMapping("/{userId}")
    public ResponseEntity<?> getNotifications(@PathVariable String userId) {
        // 알림 목록 조회
        return null;
    }

    @GetMapping("/count/{userId}")
    public ResponseEntity<?> getNotificationCount(@PathVariable String userId) {
        // 알림 개수 조회
        return null;
    }

    @GetMapping("/read/{notificationId}")
    public ResponseEntity<?> readNotification(@PathVariable String notificationId) {
        // 알림 읽음 처리
        return null;
    }

    @GetMapping("/read/all/{userId}")
    public ResponseEntity<?> readAllNotifications(@PathVariable String userId) {
        // 모든 알림 읽음 처리
        return null;
    }

    @GetMapping("/delete/{notificationId}")
    public ResponseEntity<?> deleteNotification(@PathVariable String notificationId) {
        // 알림 삭제
        return null;
    }

    @GetMapping("/delete/all/{userId}")
    public ResponseEntity<?> deleteAllNotifications(@PathVariable String userId) {
        // 모든 알림 삭제
        return null;
    }
    
}
