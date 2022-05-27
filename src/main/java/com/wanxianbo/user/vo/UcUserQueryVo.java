package com.wanxianbo.user.vo;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
public class UcUserQueryVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    private Integer status;
}
