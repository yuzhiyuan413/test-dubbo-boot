package yzy.testdubbobootprovider.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import yzy.testdubbobootprovider.factory.PayServiceFactory;
import yzy.testdubbobootprovider.service.PayService;

@Service
public class CommonPayServiceImpl implements PayService, InitializingBean {

    @Override
    public String pay() {
        return "普通用户付款。。。";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        PayServiceFactory.register("common-user", this);
    }
}
