package com.xiaochuang.pervue.mapper;

import com.xiaochuang.pervue.entity.User_role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface User_roleMapper extends BaseMapper<User_role> {

    void removeByUid(Integer rid);
}
