package com.xiaochuang.pervue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Role;
import com.xiaochuang.pervue.entity.RoleVo;
import com.xiaochuang.pervue.service.IRoleService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService iRoleService;
    @RequestMapping("/list")
    public ResultEntity list(){

        return ResultEntity.ok(iRoleService.list());
    }

    @RequestMapping("/select")
    public ResultEntity selectPageVo(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "3")long size, RoleVo roleVo){
        Page page=new Page(current,size);

        IPage iPage = iRoleService.selectPageVo(page, roleVo);
        return  ResultEntity.ok(iPage);
    }
    @RequestMapping("/deletes")
    public ResultEntity deletes(Integer []ids){
        boolean b = iRoleService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(b);
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Role role){
        boolean b = iRoleService.updateById(role);
        return ResultEntity.ok(b);
    }
}

