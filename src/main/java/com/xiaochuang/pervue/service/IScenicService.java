package com.xiaochuang.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Scenic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochuang.pervue.entity.ScenicVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xc
 * @since 2020-03-15
 */
public interface IScenicService extends IService<Scenic> {
    /**
     * 景点列表
     * @param page
     * @param scenicVo
     * @return
     */
    IPage selectVo(Page page, ScenicVo scenicVo);
}
