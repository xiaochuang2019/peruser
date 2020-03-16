package com.xiaochuang.pervue.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Scenic;
import com.xiaochuang.pervue.entity.ScenicVo;
import com.xiaochuang.pervue.service.IScenicService;
import com.xiaochuang.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    private IScenicService iScenicService;

    /**
     * 景点列表查询
     * @param current
     * @param size
     * @param scenicVo
     * @return
     */
    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1") long current,@RequestParam(defaultValue = "8") long size, ScenicVo scenicVo){
        Page page=new Page(current,size);
        IPage iPage = iScenicService.selectVo(page, scenicVo);
        return ResultEntity.ok(iPage);
    }
    /**
     * 添加景点
     */
    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Scenic scenic){
        boolean save = iScenicService.save(scenic);

        return ResultEntity.ok(save);
    }

    /**
     * 修改景点信息
     * @param scenic
     * @return
     */
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Scenic scenic){
        boolean save = iScenicService.updateById(scenic);

        return ResultEntity.ok(save);
    }
    @RequestMapping("/deleteById")
    public ResultEntity deleteById(Integer id){
        boolean b = iScenicService.removeById(id);
        return ResultEntity.ok(b);
    }
}

