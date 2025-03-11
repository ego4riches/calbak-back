package com.calbak.domain.comment;

import com.calbak.domain.comment.dto.CommentRequestDto;
import com.calbak.domain.comment.dto.CommentUpdateRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/schedules/{scheduleId}/comments")
@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "5. 일정 댓글 Controller", description = "일정 댓글 API")
public class CommentController {

    @PostMapping
    public ResponseEntity<?> addComment(@PathVariable String scheduleId, @RequestBody CommentRequestDto request) {
        // 댓글 작성
        return null;
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<?> updateComment(@PathVariable String scheduleId, @PathVariable String commentId, @RequestBody CommentUpdateRequest request) {
        // 댓글 수정
        return null;
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable String scheduleId, @PathVariable String commentId) {
        // 댓글 삭제
        return null;
    }
}
