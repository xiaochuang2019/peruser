package com.xiaochuang.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochuang.pervue.entity.UserVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<UserVo> selectVo(Page<?> page,UserVo userVo);
}
