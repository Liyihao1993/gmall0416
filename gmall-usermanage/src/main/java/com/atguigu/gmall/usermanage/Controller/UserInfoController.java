package com.atguigu.gmall.usermanage.Controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    //    @ResponseBody : 返回Json 字符串，将数据显示在页面上
    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> getAll() {
        // ctrl+alt+b 进入实现类
        List<UserInfo> userInfoList = userInfoService.finAll();
        return userInfoList;
    }
}