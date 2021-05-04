package com.cjp.dao;

import com.cjp.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = "classpath:applicationContext.xml") // 加载配置文件
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectByPrimaryKey() {
        System.out.println(userMapper.selectByPrimaryKey(28L));
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("Jisoo");
        user.setAge(26);
        user.setSex("female");
        user.setIdCard("XL11111");
        user.setAddress("Korea");
        userMapper.insert(user);
    }

    @Test
    public void testInsertBatch() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("Jisoo");
            user.setAge(26);
            user.setSex("female");
            user.setIdCard("XL11111" + i);
            user.setAddress("Korea");
            users.add(user);
        }
        userMapper.insertBatch(users);
    }
}
