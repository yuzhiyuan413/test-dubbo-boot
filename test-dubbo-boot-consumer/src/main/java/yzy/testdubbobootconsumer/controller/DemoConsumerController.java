package yzy.testdubbobootconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yzy.testdubbobootapi.dubbo.DemoService;

@RestController
public class DemoConsumerController {
    @Reference
    private DemoService demoService;

    @GetMapping("/dubbo/test")
    public void test() {
        demoService.sayHello("yuzhiyuan");
    }
}
