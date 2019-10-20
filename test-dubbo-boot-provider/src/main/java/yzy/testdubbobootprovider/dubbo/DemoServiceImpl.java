package yzy.testdubbobootprovider.dubbo;

import yzy.testdubbobootapi.dubbo.DemoService;


import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String content) {
        try {
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + content + ", request from consumer: " + InetAddress.getLocalHost());
            return "hello," + content+ ", response from provider: " + InetAddress.getLocalHost();
        } catch (Exception e) {
            return "not net";
        }
    }
}
