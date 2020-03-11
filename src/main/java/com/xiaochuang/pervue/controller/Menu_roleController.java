package com.xiaochuang.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaochuang.pervue.entity.Menu_role;
import com.xiaochuang.pervue.service.IMenu_roleService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu_role")
public class Menu_roleController {
    @Autowired
    private IMenu_roleService iMenu_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer rid,Integer []mids){
        try {
            iMenu_roleService.insert(rid,mids);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.error();
        }

        return ResultEntity.ok(true);
    }
}

