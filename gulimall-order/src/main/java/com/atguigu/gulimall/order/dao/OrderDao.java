package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author congwen
 * @email 2212007720@qq.com
 * @date 2021-07-29 00:23:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
