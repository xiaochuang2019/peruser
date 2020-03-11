package com.xiaochuang.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Role;
import com.xiaochuang.pervue.entity.RoleVo;
import com.xiaochuang.pervue.mapper.RoleMapper;
import com.xiaochuang.pervue.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public IPage selectPageVo(Page page, RoleVo roleVo) {
        return roleMapper.selectPageVo(page,roleVo);
    }
}
