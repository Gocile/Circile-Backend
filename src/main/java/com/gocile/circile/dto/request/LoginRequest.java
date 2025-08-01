package com.gocile.circile.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户登录请求实体
 * @Date 2025-08-01 16:52
 */
@Data
public class LoginRequest {
    @Schema(description = "邮箱", example = "user@example.com")
    String email;
    @Schema(description = "密码", example = "pwd123456")
    String password;
}
