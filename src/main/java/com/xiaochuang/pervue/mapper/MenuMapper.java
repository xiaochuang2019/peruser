package com.xiaochuang.pervue.mapper;

import com.xiaochuang.pervue.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 查询菜单列表
     * @return
     */
    List<Menu> listMenus();

    /**
     * 返回用户对应的权限列表
     * @param userName
     * @return
     */
    List<Menu> listMenusByUserName(String userName);
}
