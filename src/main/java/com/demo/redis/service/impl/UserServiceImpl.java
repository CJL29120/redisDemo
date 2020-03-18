package com.demo.redis.service.impl;

import com.demo.redis.model.User;
import com.demo.redis.dao.UserDao;
import com.demo.redis.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2020-03-18
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Cacheable(value = "user",key = "#root.args[0]",condition = "#id > 0",unless = "#result eq null")
    @Override
    public User getById(Serializable id){
      log.info("getById");
      return super.getById(id);
    }

    @CachePut(value = "user",key = "#root.args[0].id",unless = "#result eq null")
    @Override
    public User updateUserById(User user){
        log.info("updateUserById");
        return super.updateById(user) ? user : null;
    }

    @CacheEvict(value = "user",key = "#root.args[0]",condition = "#result eq true")
    @Override
    public boolean removeById(Serializable id){
        log.info("removeById");
        return super.removeById(id);
    }
}
