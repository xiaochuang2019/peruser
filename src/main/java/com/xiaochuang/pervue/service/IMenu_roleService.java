package com.xiaochuang.pervue.service;

import com.xiaochuang.pervue.entity.Menu_role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
public interface IMenu_roleService extends IService<Menu_role> {

    void insert(Integer rid,Integer mids[]) throws Exception;
}
