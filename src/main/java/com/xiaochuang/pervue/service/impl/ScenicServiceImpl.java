package com.xiaochuang.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochuang.pervue.entity.Scenic;
import com.xiaochuang.pervue.entity.ScenicVo;
import com.xiaochuang.pervue.mapper.ScenicMapper;
import com.xiaochuang.pervue.service.IScenicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-15
 */
@Service
public class ScenicServiceImpl extends ServiceImpl<ScenicMapper, Scenic> implements IScenicService {
    @Autowired
    private ScenicMapper scenicMapper;
    @Override
    public IPage selectVo(Page page, ScenicVo scenicVo) {
        return scenicMapper.selectVo(page,scenicVo);
    }
}
