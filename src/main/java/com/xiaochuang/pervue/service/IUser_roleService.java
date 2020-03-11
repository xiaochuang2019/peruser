package com.xiaochuang.pervue.service;

import com.xiaochuang.pervue.entity.User_role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface IUser_roleService extends IService<User_role> {

    void removeByUid(Integer rid);

}
