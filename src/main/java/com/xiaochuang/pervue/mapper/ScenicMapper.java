package com.xiaochuang.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Scenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochuang.pervue.entity.ScenicVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-15
 */
public interface ScenicMapper extends BaseMapper<Scenic> {
    /**
     * 景点列表
     * @param page
     * @param scenicVo
     * @return
     */
    IPage selectVo(Page page, ScenicVo scenicVo);
}
