package com.lmk.controller;

import com.lmk.mapper.UsersMapper;
import com.lmk.user.Users;
import com.lmk.user.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户 管理
 * @author LiuMengKe
 * @create 2018-04-04-15:33
 */
@Controller
public class UserController {

    @Autowired
    UsersMapper usersMapper;


    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/user/list")
    public String getUserList(Model model) {
        UsersExample usersExample = new UsersExample();
        usersExample.setLimitStart(0);
        usersExample.setLimitSize(15);
        List<Users> userList = usersMapper.selectByExample(usersExample);
        model.addAttribute("userList",userList);
        return "user";
    }


}
