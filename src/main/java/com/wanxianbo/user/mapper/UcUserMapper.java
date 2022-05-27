package com.wanxianbo.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wanxianbo.plugins.Page;
import com.wanxianbo.user.entity.UcUser;
import com.wanxianbo.user.vo.UcUserQueryVo;
import com.wanxianbo.user.vo.UcUserVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
public interface UcUserMapper {
    IPage<UcUser> pageUcUserVo(@Param("page") Page<UcUser> page, @Param("queryVo") UcUserQueryVo queryVo);
}