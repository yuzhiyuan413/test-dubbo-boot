package yzy.testdubbobootprovider.factory;

import yzy.testdubbobootprovider.service.PayService;

import java.util.HashMap;
import java.util.Map;

public class PayServiceFactory {
    private static Map<String, PayService> stringPayServiceMap = new HashMap<>();

    public static PayService getByUserType(String type) {
        return stringPayServiceMap.get(type);
    }

    public static void register(String userType, PayService payService) {
        stringPayServiceMap.put(userType, payService);
    }
}
