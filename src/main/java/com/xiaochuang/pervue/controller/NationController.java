package com.xiaochuang.pervue.controller;


import com.xiaochuang.pervue.service.INationService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/nation")
public class NationController {
    @Autowired
    private INationService iNationService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/list")
    public ResultEntity findAll(){
        ListOperations listOperations = redisTemplate.opsForList();
        List list = listOperations.range("nation", 0, -1);
        return ResultEntity.ok(list);
    }
}

