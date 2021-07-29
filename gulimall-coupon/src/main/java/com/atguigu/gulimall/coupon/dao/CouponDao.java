package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author congwen
 * @email 2212007720@qq.com
 * @date 2021-07-29 00:17:32
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
