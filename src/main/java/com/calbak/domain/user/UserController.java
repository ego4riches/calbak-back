package com.calbak.domain.user;

import com.calbak.domain.user.dto.UserCreateRequestDto;
import com.calbak.domain.user.dto.UserUpdateRequestDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "1. 유저 Controller", description = "유저 API")
public class UserController {

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserCreateRequestDto user) {
        // 유저 생성 (가입)
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> search(@PathVariable String userId) {
        // 유저 조회 (친구 찾기 시)
        return null;
    }

    @PatchMapping("/{userId}")
    public ResponseEntity<?> update(@PathVariable String userId, @RequestBody UserUpdateRequestDto user) {
        // 유저 정보 업데이트 (닉네임 변경, 비밀번호 변경 등)
        return null;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> delete(@PathVariable String userId) {
        // 유저 삭제
        return null;
    }
}
