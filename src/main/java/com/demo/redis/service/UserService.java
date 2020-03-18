package com.demo.redis.service;

import com.demo.redis.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author chen
 * @since 2020-03-18
 */
public interface UserService extends IService<User> {

    User updateUserById(User user);

}
