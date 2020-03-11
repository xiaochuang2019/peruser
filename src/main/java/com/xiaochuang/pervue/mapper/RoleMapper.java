package com.xiaochuang.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochuang.pervue.entity.RoleVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {
    IPage selectPageVo(Page page, RoleVo roleVo);
}
