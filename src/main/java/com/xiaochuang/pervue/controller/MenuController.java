package com.xiaochuang.pervue.controller;


import com.xiaochuang.pervue.entity.User;
import com.xiaochuang.pervue.service.IMenuService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iMenuService.listMenus());
    }

    @RequestMapping("/listByUserName")
    public ResultEntity listByUserName(HttpServletRequest request, @RequestParam(defaultValue = "lisi") String userName){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user!=null){
            userName = user.getUsername();
            System.out.println(userName+"@@@@"+session.getId());
        }
        return ResultEntity.ok(iMenuService.listMenusByUserName(userName));
    }
}

