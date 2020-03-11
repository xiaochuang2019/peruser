package com.xiaochuang.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochuang.pervue.entity.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface IUserService extends IService<User> {
    IPage<UserVo> selectVo(Page<?> page, UserVo userVo);
}
