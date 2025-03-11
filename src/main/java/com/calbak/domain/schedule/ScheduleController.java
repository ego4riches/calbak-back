package com.calbak.domain.schedule;

import com.calbak.domain.schedule.dto.ScheduleApplyRequestDto;
import com.calbak.domain.schedule.dto.ScheduleDecisionRequestDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/schedules")
@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "4. 일정 Controller", description = "일정 API")
public class ScheduleController {

    @PostMapping("/request")
    public ResponseEntity<?> createScheduleRequest(@RequestBody ScheduleApplyRequestDto request) {
        // 일정 요청 생성
        return null;
    }

    @PostMapping("/response")
    public ResponseEntity<?> respondScheduleRequest(@RequestBody ScheduleDecisionRequestDto request) {
        // 일정 요청 응답 (수락/거절)
        return null;
    }

    @GetMapping("/list/{userId}")
    public ResponseEntity<?> getSchedules(@PathVariable String userId) {
        // 일정 목록 조회
        return null;
    }

}
