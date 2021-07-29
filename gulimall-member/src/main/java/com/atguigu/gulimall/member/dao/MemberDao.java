package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author congwen
 * @email 2212007720@qq.com
 * @date 2021-07-29 00:20:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
