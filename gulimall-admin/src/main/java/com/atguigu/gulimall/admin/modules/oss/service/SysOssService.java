/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.gulimall.admin.modules.oss.service;

import com.atguigu.gulimall.admin.common.utils.PageUtils;
import com.atguigu.gulimall.admin.modules.oss.entity.SysOssEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
