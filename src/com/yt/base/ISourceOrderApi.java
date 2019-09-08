package com.yt.base;

import java.util.Date;

/**
 * 原订单api  原O2O订单提货延长有效期接口需要提供截至时间和订单号
 */
public interface ISourceOrderApi {

    void update(Long orderId, Date date, String client);
}
