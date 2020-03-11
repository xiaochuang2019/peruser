package com.xiaochuang.pervue.service.impl;

import com.xiaochuang.pervue.entity.Nation;
import com.xiaochuang.pervue.entity.NationVo;
import com.xiaochuang.pervue.mapper.NationMapper;
import com.xiaochuang.pervue.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {
    @Autowired
    private NationMapper nationMapper;


    @Override
    public List<NationVo> findAll() {
        return nationMapper.findAll();
    }
}
