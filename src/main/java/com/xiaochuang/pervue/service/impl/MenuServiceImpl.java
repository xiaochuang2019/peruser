package com.xiaochuang.pervue.service.impl;

import com.xiaochuang.pervue.entity.Menu;
import com.xiaochuang.pervue.mapper.MenuMapper;
import com.xiaochuang.pervue.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> listMenus() {
        return menuMapper.listMenus();
    }

    @Override
    public List<Menu> listMenusByUserName(String userName) {
        return menuMapper.listMenusByUserName(userName);
    }
}
