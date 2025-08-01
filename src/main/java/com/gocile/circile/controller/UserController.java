package com.gocile.circile.controller;

import com.gocile.circile.dto.request.LoginRequest;
import com.gocile.circile.dto.request.RegisterRequest;
import com.gocile.circile.dto.response.CommonResponse;
import com.gocile.circile.dto.response.LoginResponse;
import com.gocile.circile.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户相关接口
 * @Date 2025-07-31 11:55
 */
@Tag(name = "用户信息接口")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {
    private final UserService userService;

    @Operation(summary = "登录")
    @PostMapping("/login")
    public CommonResponse<LoginResponse> userLogin(
            @RequestBody LoginRequest loginRequest
    ) {
        return userService.userLogin(loginRequest.getEmail(), loginRequest.getPassword());
    }

    @Operation(summary = "注册")
    @PostMapping("/register")
    public CommonResponse<String> userRegister(
            @RequestBody RegisterRequest registerRequest
    ) {
        return null;
    }

    @Operation(summary = "注销")
    @DeleteMapping("/close")
    public CommonResponse<String> userClose(
            @RequestParam(name = "邮箱") String email
    ) {
        return null;
    }
}
