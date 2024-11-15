package com.pzl.obwiki.service.impl;

import com.pzl.obwiki.entity.User;
import com.pzl.obwiki.mapper.UserMapper;
import com.pzl.obwiki.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cr
 * @since 2024-11-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
