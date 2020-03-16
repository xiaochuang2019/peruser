package com.xiaochuang.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Goods;
import com.xiaochuang.pervue.entity.GoodsVo;
import com.xiaochuang.pervue.mapper.GoodsMapper;
import com.xiaochuang.pervue.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-13
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public IPage<GoodsVo> selectVos(Page page, GoodsVo goodsVo) {
        return goodsMapper.selectVos(page,goodsVo);
    }
}
