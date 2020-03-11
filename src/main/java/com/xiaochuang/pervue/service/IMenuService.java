package com.xiaochuang.pervue.service;

import com.xiaochuang.pervue.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> listMenus();
    /**
     * 返回用户对应的权限列表
     * @param userName
     * @return
     */
    List<Menu> listMenusByUserName(String userName);
}
