package com.xiaochuang.pervue.controller;


import com.xiaochuang.pervue.entity.User_role;
import com.xiaochuang.pervue.service.IUser_roleService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/user_role")
public class User_roleController {
    @Autowired
    private IUser_roleService iUser_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer uid,Integer rids[]){
        User_role user_role=new User_role();
        user_role.setId(0);
        user_role.setUid(uid);

        if (rids!=null && rids.length>0){

            iUser_roleService.removeByUid(uid);
            int a=0;
            for (Integer i:rids) {
                user_role.setRid(i);
                iUser_roleService.save(user_role);
                a++;
                if(a==rids.length){
                    return ResultEntity.ok(true);
                }
            }
        }

        return ResultEntity.error();
    }
}

