package com.xiaochuang.pervue.service.impl;

import com.xiaochuang.pervue.entity.Test;
import com.xiaochuang.pervue.mapper.TestMapper;
import com.xiaochuang.pervue.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xc
 * @since 2020-03-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
