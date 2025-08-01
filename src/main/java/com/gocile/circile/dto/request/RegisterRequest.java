package com.gocile.circile.dto.request;

import lombok.Data;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户注册请求实体
 * @Date 2025-07-31 16:32
 */
@Data
public class RegisterRequest {
    String email;
    String password;
    String nickname;
    String profile;
    String avatar;
}
