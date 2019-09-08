package com.yt.base;

import java.util.Date;

public class SourceOrderApiImpl implements ISourceOrderApi {

    @Override
    public void update(Long orderId, Date date, String client) {
        System.out.println("客户端【"+ client +"】订单号【" + orderId + "】订单延长有效期至【" + date + "】");
    }
}
