package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author congwen
 * @email 2212007720@qq.com
 * @date 2021-07-28 22:13:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
