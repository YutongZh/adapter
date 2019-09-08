package com.yt.adapter;

/**
 *  适配器模式  兼容  APP 需要新增一个接口
 */
public interface IAdapterOrderAPIForAPP {
    void update(Long orderId, String client);
}
