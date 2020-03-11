package com.xiaochuang.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.User;
import com.xiaochuang.pervue.entity.UserVo;
import com.xiaochuang.pervue.mapper.UserMapper;
import com.xiaochuang.pervue.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public IPage<UserVo> selectVo(Page<?> page, UserVo userVo) {
        return userMapper.selectVo(page,userVo);
    }
}
