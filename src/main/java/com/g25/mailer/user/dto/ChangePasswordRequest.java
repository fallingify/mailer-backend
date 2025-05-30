package com.g25.mailer.user.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
@Schema(description = "비밀번호 변경 요청 DTO")
public class ChangePasswordRequest {

    @Schema(description = "새 비밀번호", example = "NewP@ssw0rd456")
    @NotBlank(message = "새 비밀번호를 입력하세요.")
    private String newPassword;
}
