package com.wanxianbo.user.entity;

import java.time.LocalDateTime;

/**
 * @author wanxianbo
 * @description 
 * @date 创建于 2022/5/27
 */
public class UcUser {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}