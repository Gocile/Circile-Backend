package com.gocile.circile.exception;

/**
 * @Author Gocile
 * @Version 1.0
 * @Description 异常信息枚举
 * @Date 2025-07-31 15:48
 */
public enum ErrorCode {
    //1xxx: 用户相关异常
    USER_ALREADY_EXIST(1001,"该邮箱已被注册"),
    USER_VERIFICATION_CODE_WRONG(1002,"验证码错误"),
    USER_NOT_FOUND(1003,"邮箱或密码错误"),
    USER_NOT_LOGIN(1004,"请先登录"),
    USER_TOKEN_FAILURE(1005,"登录过期，请重新登录"),
    //2xxx: 内容操作异常
    POST_NOT_FOUND(2001,"帖子不存在"),
    COMMENT_NOT_FOUND(2101,"该评论已被删除"),
    ATTACHMENT_UPLOAD_FAILED(2201,"附件上传失败，请检查文件大小并重试"),
    ATTACHMENT_DOWNLOAD_FAILED(2202,"文件下载失败，请重试"),
    //3xxx: 数据校验异常
    PARAM_MISSING(3001,"必要信息缺失，请重试"),
    PARAM_ERROR(3002,"格式错误或长度超限，请重试"),
    //4xxx: 系统级异常
    DATABASE_CONNECTION_ERROR(4001,"服务器异常"),
    INTERNAL_ERROR(4002,"操作失败，请重试");

    private final int code;
    private final String message;

    ErrorCode(int code,String message){
        this.code=code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode findError(int code){
        for(ErrorCode errorCode:values()){
            if(errorCode.code==code){
                return errorCode;
            }
        }
        return INTERNAL_ERROR;
    }
}
