package com.wanxianbo.user.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
@Data
public class UcUserVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 加密使用的盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 上次更新时间
     */
    private LocalDateTime lastUpdateTime;
}
