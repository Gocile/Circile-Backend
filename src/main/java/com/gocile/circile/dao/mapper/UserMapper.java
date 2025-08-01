package com.gocile.circile.dao.mapper;

import com.gocile.circile.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 用户信息持久化映射
 * @Date 2025-08-01 14:31
 */
@Mapper
public interface UserMapper {
    User userLogin(String email,String password);
}
