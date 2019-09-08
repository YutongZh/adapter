package com.yt.decorator;

import com.yt.base.ISourceOrderApi;
import com.yt.base.SourceOrderApiImpl;

import java.util.Date;

/**
 * 装饰器模式，不仅延长收货有效期，而且还需要延长退货有效期
 */
public class DecoratorSourceOrderAPIImpl implements ISourceOrderApi{

    private ISourceOrderApi sourceOrderApi;

    public DecoratorSourceOrderAPIImpl() {
        this.sourceOrderApi = new SourceOrderApiImpl();
    }

    @Override
    public void update(Long orderId, Date date, String client) {
        sourceOrderApi.update(orderId, date, client);
        System.out.println("延长退货有效期至「" + new Date() +"」");
    }
}
