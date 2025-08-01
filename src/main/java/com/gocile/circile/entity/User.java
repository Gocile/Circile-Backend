package com.gocile.circile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户信息实体类
 * @Date 2025-08-01 11:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;
    String email;
    String password;
    String nickname;
    String profile;
    String avatar;
}
