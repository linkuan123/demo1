package com.weteam.cms.controller;

import com.weteam.cms.common.utils.ResultUtil;
import com.weteam.cms.mapper.UserMapper;
import com.weteam.cms.modal.entity.User;
import com.weteam.cms.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/test")
public class testController {

    @Resource
    UserMapper userMapper;
    @Resource
    UserRepository userRepository;


    @RequestMapping("/test1")
    public ResultUtil test1() {
        User user = userMapper.selectByPrimaryKey(1);
        return ResultUtil.success(user);
    }

    @RequestMapping("/test2")
    public ResultUtil test2() {
        User user = userRepository.findById(1).orElse(null);
        return ResultUtil.success(user);
    }
}
