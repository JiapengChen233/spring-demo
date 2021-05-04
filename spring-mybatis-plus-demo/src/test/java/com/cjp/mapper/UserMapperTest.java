package com.cjp.mapper;

import com.cjp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = "classpath:applicationContext.xml") // 加载配置文件
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        System.out.println(userMapper.selectById(28L));
    }

    @Test
    public void testSelectByColumn() {
        userMapper.findByColumn("name", "Jisoo").forEach(System.out::println);
    }

    @Test
    public void testInsertBatch() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("Lisa");
            user.setSex("female");
            user.setAge(24);
            user.setAddress("Korea");
            user.setIdCard("XL11111");
            users.add(user);
        }
        userMapper.insertBatch(users);
    }

}
