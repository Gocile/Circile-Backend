package com.gocile.circile.dto.response;

import lombok.Data;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 登录接口响应实体
 * @Date 2025-08-01 15:12
 */
@Data
public class LoginResponse {
    String nickname;
    String profile;
    String avatar;
    String token;
}
