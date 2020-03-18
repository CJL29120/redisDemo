package com.demo.redis.dao;

import com.demo.redis.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author chen
 * @since 2020-03-18
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
