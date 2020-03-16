package com.xiaochuang.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochuang.pervue.entity.GoodsVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xc
 * @since 2020-03-13
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 分页以及条件查询商品列表
     * @param page
     * @param goodsVo
     * @return
     */
        IPage<GoodsVo> selectVos(Page page,GoodsVo goodsVo);
}
