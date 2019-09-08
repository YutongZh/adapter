package com.yt.adapter;

import com.yt.base.ISourceOrderApi;
import com.yt.base.SourceOrderApiImpl;

import java.util.Date;

/**
 * 适配器模式 兼容 app
 */
public class AdapterOrderAPIForAPPImpl implements IAdapterOrderAPIForAPP {

    private ISourceOrderApi sourceOrderApi;

    public AdapterOrderAPIForAPPImpl() {
        this.sourceOrderApi = new SourceOrderApiImpl();
    }

    @Override
    public void update(Long orderId, String client) {
        //此处为业务逻辑，不修改原有接口逻辑
        System.out.println("===我是app版本的延长收获时间===");
        sourceOrderApi.update(orderId, new Date(), client);
    }
}
