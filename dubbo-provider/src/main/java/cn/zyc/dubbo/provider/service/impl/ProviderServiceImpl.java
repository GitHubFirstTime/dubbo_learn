package cn.zyc.dubbo.provider.service.impl;

import cn.zyc.api.UserService;
import cn.zyc.model.entity.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class ProviderServiceImpl implements UserService {
    public String sayHello(String name) {
        return "你好,"+name;
    }

    @Override
    public User getUser() {
        User user = new User();
        user.setId("001");
        user.setName("你好，张迎春");
        return user;
    }
}
