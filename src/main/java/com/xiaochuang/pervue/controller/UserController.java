package com.xiaochuang.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.User;
import com.xiaochuang.pervue.entity.UserVo;
import com.xiaochuang.pervue.service.IUserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;
    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "3")long size, UserVo userVo){
        Page page=new Page(current,size);

        IPage<UserVo> iPage = iUserService.selectVo(page, userVo);
        return ResultEntity.ok(iPage);
    }
    @RequestMapping("/deleteByIds")
    public ResultEntity del(Integer []ids){
        boolean b = iUserService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(b);
    }
    @RequestMapping("/deleteById")
    public ResultEntity del(Integer id){
        boolean b = iUserService.removeById(id);
        return ResultEntity.ok(b);
    }
    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody User user){
        boolean b = iUserService.save(user);
        return ResultEntity.ok(b);
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody User user){
        boolean b = iUserService.updateById(user);
        return ResultEntity.ok(b);
    }
}

