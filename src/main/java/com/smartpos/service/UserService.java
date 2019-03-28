package com.smartpos.service;

import com.smartpos.domain.User;
import com.smartpos.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangchunlan
 * @ClassName UserService.java
 * @Description
 * @createTime 2019年03月28日 13:11:00
 */
@Service
public class UserService {

//    @Autowired
    @Resource
    private UserMapper userMapper;

    public User get(Long param){
      return  userMapper.selectByPrimaryKey(param);
    }
}
