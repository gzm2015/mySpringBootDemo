package com.lmk.controller;

import com.lmk.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户 管理
 * @author LiuMengKe
 * @create 2018-04-04-15:33
 */
@Controller
public class UserController {


    @RequestMapping("/user/list")
    public String getUserList(Model model) {
        User user = new User("1","abc");
        model.addAttribute("user",user);
        return "user";
    }


}
