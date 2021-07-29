/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.gulimall.admin.modules.oss.service.impl;

import com.atguigu.gulimall.admin.common.utils.PageUtils;
import com.atguigu.gulimall.admin.common.utils.Query;
import com.atguigu.gulimall.admin.modules.oss.dao.SysOssDao;
import com.atguigu.gulimall.admin.modules.oss.entity.SysOssEntity;
import com.atguigu.gulimall.admin.modules.oss.service.SysOssService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysOssEntity> page = this.page(
                new Query<SysOssEntity>().getPage(params)
        );

        return new PageUtils(page);
    }

}
