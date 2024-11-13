package com.xiaobaicai.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaobaicai.web.dataobject.UserDO;
import com.xiaobaicai.web.mapper.UserMapper;
import com.xiaobaicai.web.service.UserDaoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户注册信息 服务实现类
 * </p>
 *
 * @author xiaobaicai
 * @since 2024-11-13
 */
@Service
public class UserDaoServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserDaoService {

}
