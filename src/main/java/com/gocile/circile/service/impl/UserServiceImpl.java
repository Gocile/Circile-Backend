package com.gocile.circile.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.gocile.circile.dao.mapper.UserMapper;
import com.gocile.circile.dto.response.CommonResponse;
import com.gocile.circile.dto.response.LoginResponse;
import com.gocile.circile.entity.User;
import com.gocile.circile.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户相关功能实现类
 * @Date 2025-08-01 14:49
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public CommonResponse<LoginResponse> userLogin(String email, String password) {
        User user = userMapper.userLogin(email, password);
        LoginResponse loginResponse = BeanUtil.copyProperties(user, LoginResponse.class);
        return CommonResponse.success("登录成功", loginResponse);
    }
}
