package com.gocile.circile.service;

import com.gocile.circile.dto.response.CommonResponse;
import com.gocile.circile.dto.response.LoginResponse;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户相关功能接口
 * @Date 2025-08-01 14:48
 */
public interface UserService {
    CommonResponse<LoginResponse> userLogin(String email, String password);
}
