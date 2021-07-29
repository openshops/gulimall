/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.gulimall.admin.modules.job.service.impl;

import com.atguigu.gulimall.admin.common.utils.PageUtils;
import com.atguigu.gulimall.admin.common.utils.Query;
import com.atguigu.gulimall.admin.modules.job.dao.ScheduleJobLogDao;
import com.atguigu.gulimall.admin.modules.job.entity.ScheduleJobLogEntity;
import com.atguigu.gulimall.admin.modules.job.service.ScheduleJobLogService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity> implements ScheduleJobLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String jobId = (String) params.get("jobId");

        IPage<ScheduleJobLogEntity> page = this.page(
                new Query<ScheduleJobLogEntity>().getPage(params),
                new QueryWrapper<ScheduleJobLogEntity>().like(StringUtils.isNotBlank(jobId), "job_id", jobId)
        );

        return new PageUtils(page);
    }

}
