package com.xiaochuang.pervue.service.impl;

import com.xiaochuang.pervue.entity.User_role;
import com.xiaochuang.pervue.mapper.User_roleMapper;
import com.xiaochuang.pervue.service.IUser_roleService;
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
public class User_roleServiceImpl extends ServiceImpl<User_roleMapper, User_role> implements IUser_roleService {

    @Autowired
    private User_roleMapper user_roleMapper;
    @Override
    public void removeByUid(Integer rid) {
        user_roleMapper.removeByUid(rid);
    }
}
