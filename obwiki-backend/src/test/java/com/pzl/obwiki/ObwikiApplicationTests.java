package com.pzl.obwiki;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.pzl.obwiki.entity.*;
import com.pzl.obwiki.entity.User;
import com.pzl.obwiki.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ObwikiApplicationTests {

        @Autowired
        private UserMapper userMapper;

        @Test
        public void queryUser(){
            List<User> users = userMapper.selectList(new QueryWrapper<>());
            System.out.println(users);
        }

}
