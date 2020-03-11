package com.xiaochuang.pervue.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaochuang.pervue.entity.Menu_role;
import com.xiaochuang.pervue.mapper.Menu_roleMapper;
import com.xiaochuang.pervue.service.IMenu_roleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@Service
public class Menu_roleServiceImpl extends ServiceImpl<Menu_roleMapper, Menu_role> implements IMenu_roleService {

    @Autowired
    private Menu_roleMapper menu_roleMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(Integer rid, Integer[] mids) throws Exception {

        if (mids!=null && mids.length>0 && rid!=null) {

            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("rid", rid);
            menu_roleMapper.delete(queryWrapper);
            Menu_role menu_role = new Menu_role();
            menu_role.setRid(rid);
            for (Integer i:
                    mids) {
                menu_role.setMid(i);
                menu_roleMapper.insert(menu_role);
            }
        }
    }
}
