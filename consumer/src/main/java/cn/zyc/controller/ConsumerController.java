package cn.zyc.controller;

import cn.zyc.api.UserService;
import cn.zyc.dubbo.provider.service.impl.ProviderServiceImpl;
import cn.zyc.model.entity.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class ConsumerController {
//    @Resource
    @Reference(version = "1.0.0",interfaceClass = cn.zyc.api.UserService.class)
    public UserService userService;//注意：接口非实现类
    @RequestMapping("getUser")
    @ResponseBody
    User getUser(){
        return userService.getUser();
    }
}
