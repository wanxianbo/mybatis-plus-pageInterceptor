package com.wanxianbo.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wanxianbo.plugins.Page;
import com.wanxianbo.user.entity.UcUser;
import com.wanxianbo.user.vo.UcUserQueryVo;
import com.wanxianbo.user.vo.UcUserVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wanxianbo.user.mapper.UcUserMapper;
import com.wanxianbo.user.service.UcUserService;
/**
 * @author wanxianbo
 * @description 
 * @date 创建于 2022/5/27
 */
@Service
public class UcUserServiceImpl implements UcUserService{

    @Resource
    private UcUserMapper ucUserMapper;

    @Override
    public IPage<UcUser> pageUcUserVo(Page<UcUser> page, UcUserQueryVo queryVo) {
        return ucUserMapper.pageUcUserVo(page, queryVo);
    }
}
