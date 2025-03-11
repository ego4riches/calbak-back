package com.calbak.domain.friendship;

import com.calbak.domain.friendship.dto.FriendshipApplyRequestDto;
import com.calbak.domain.friendship.dto.FriendshipDecisionRequestDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/friendships")
@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "3. 친구 Controller", description = "친구 API")
public class FriendshipController {

    @PostMapping("/request")
    public ResponseEntity<?> sendFriendRequest(@RequestBody FriendshipApplyRequestDto request) {
        // 친구 요청 처리
        return null;
    }

    @PostMapping("/response")
    public ResponseEntity<?> respondFriendRequest(@RequestBody FriendshipDecisionRequestDto request) {
        // 친구 요청 수락 / 거절 처리
        return null;
    }

    @GetMapping("/list/{userId}")
    public ResponseEntity<?> getFriendList(@PathVariable String userId) {
        // 친구 목록 조회
        return null;
    }

}
