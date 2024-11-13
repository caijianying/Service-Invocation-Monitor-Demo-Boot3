package com.xiaobaicai.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaobaicai.web.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户注册信息 Mapper 接口
 * </p>
 *
 * @author xiaobaicai
 * @since 2024-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
