package com.gocile.circile.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 通用响应实体
 * @Date 2025-07-31 16:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {
    private Integer status;
    private String message;
    private T data;

    public static <T> CommonResponse<T> success(String message,T data){
        return new CommonResponse<T>(200,message,data);
    }
}
