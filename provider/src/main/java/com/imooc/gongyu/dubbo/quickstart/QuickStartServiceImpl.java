package com.imooc.gongyu.dubbo.quickstart;

import com.imooc.gongyu.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
