package com.xiaochuang.pervue;

import com.xiaochuang.pervue.entity.NationVo;
import com.xiaochuang.pervue.service.INationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
public class RedisTest {
    @Autowired
    private INationService iNationService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void insertNation(){
        ListOperations redis = redisTemplate.opsForList();
        List<NationVo> all = iNationService.findAll();
        for (NationVo vo:all) {
            redis.rightPush("nation",vo);
        }
    }
}
