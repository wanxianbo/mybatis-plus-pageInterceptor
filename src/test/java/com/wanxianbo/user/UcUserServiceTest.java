package com.wanxianbo.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wanxianbo.plugins.Page;
import com.wanxianbo.user.entity.UcUser;
import com.wanxianbo.user.service.UcUserService;
import com.wanxianbo.user.vo.UcUserQueryVo;
import com.wanxianbo.user.vo.UcUserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author wanxianbo
 * @description
 * @date 创建于 2022/5/27
 */
@SpringBootTest
class UcUserServiceTest {
    @Autowired
    private UcUserService ucUserService;

    @Test
    void testPageUcUserVo() {
        Page<UcUser> page = new Page<>(1, 10);
        UcUserQueryVo queryVo = new UcUserQueryVo();
        IPage<UcUser> ucUserIPage = ucUserService.pageUcUserVo(page, queryVo);
        if (!CollectionUtils.isEmpty(ucUserIPage.getRecords())) {
            List<UcUser> records = ucUserIPage.getRecords();
            records.forEach(System.out::println);
        }
    }
}
