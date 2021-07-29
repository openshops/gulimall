/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.gulimall.admin.modules.app.service;


import com.atguigu.gulimall.admin.modules.app.entity.UserEntity;
import com.atguigu.gulimall.admin.modules.app.form.LoginForm;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface UserService extends IService<UserEntity> {

    UserEntity queryByMobile(String mobile);

    /**
     * 用户登录
     *
     * @param form 登录表单
     * @return 返回用户ID
     */
    long login(LoginForm form);
}
