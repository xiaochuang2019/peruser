package com.xiaochuang.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochuang.pervue.entity.RoleVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {
    IPage selectPageVo(Page page, RoleVo roleVo);
}
