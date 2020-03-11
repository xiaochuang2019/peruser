package com.xiaochuang.pervue.service.impl;

import com.xiaochuang.pervue.entity.Employee;
import com.xiaochuang.pervue.mapper.EmployeeMapper;
import com.xiaochuang.pervue.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
