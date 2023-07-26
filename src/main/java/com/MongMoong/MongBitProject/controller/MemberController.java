package com.MongMoong.MongBitProject.controller;

import com.MongMoong.MongBitProject.config.TokenProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tokens")
@Tag(name = "Member Controller", description = "사용자의 토큰 검증 API를 제공하는 컨트롤러입니다.")
public class MemberController {
    private final TokenProvider tokenProvider;

    @GetMapping("/validity")
    @Operation(summary = "토큰 유효성 검사", description = "헤더에 jwt를 담아 보내주세요.")
    public ResponseEntity<String> jwtValidate() {
        String message = "jwt 검증 성공";
        return ResponseEntity.ok(message);
    }

}
