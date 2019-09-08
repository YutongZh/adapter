package com.yt.proxy;

import com.yt.base.ISourceOrderApi;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ISourceOrderApi sourceOrderApi = new ProxySourceOrderAPIImpl();
        sourceOrderApi.update(2323232322232L, new Date(), "API");
    }
}
