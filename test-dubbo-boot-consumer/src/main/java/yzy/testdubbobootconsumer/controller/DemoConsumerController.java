package yzy.testdubbobootconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yzy.testdubbobootapi.dubbo.DemoService;

import java.util.Map;

@RestController
public class DemoConsumerController {
    // check参数代表是否检查服务提供者
    @Reference(check = false)
    private DemoService demoService;

    @GetMapping("/dubbo/test")
    public Map<String, Object> test() {
        String yuzhiyuan = demoService.sayHello("yuzhiyuan");
        Map<String,Object> map = Maps.newHashMap();
        map.put("error",yuzhiyuan);
        return map;
    }

    @GetMapping("/dubbo/pay")
    public Map<String, Object> pay() {
        String x = demoService.pay("common-user");
        Map<String,Object> map = Maps.newHashMap();
        map.put("result",x);
        return map;
    }
}
