package com.yt.proxy;

import com.yt.base.ISourceOrderApi;

import java.util.Date;

/**
 *  代理模式  增加权限校验 实现与被代理对象同一个接口
 */
public class ProxySourceOrderAPIImpl implements ISourceOrderApi {

    private ISourceOrderApi sourceOrderApi;

    @Override
    public void update(Long orderId, Date date, String client) {
        if ("admin".equals(client)){
            sourceOrderApi.update(orderId, date, client);
        } else {
            System.out.println("你无权限修改收货时间");
        }
    }
}
