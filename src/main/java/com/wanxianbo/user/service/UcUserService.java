package com.wanxianbo.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wanxianbo.plugins.Page;
import com.wanxianbo.user.entity.UcUser;
import com.wanxianbo.user.vo.UcUserQueryVo;
import com.wanxianbo.user.vo.UcUserVo;

/**
 * @author wanxianbo
 * @description 
 * @date 创建于 2022/5/27
 */
public interface UcUserService{
    IPage<UcUser> pageUcUserVo(Page<UcUser> page, UcUserQueryVo queryVo);
}
