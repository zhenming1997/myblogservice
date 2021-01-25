package com.zhen.myblogservice.service.impl;

import com.zhen.myblogservice.entity.Users;
import com.zhen.myblogservice.mapper.UsersMapper;
import com.zhen.myblogservice.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhen
 * @since 2021-01-25
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
