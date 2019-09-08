package com.yt.decorator;

import com.yt.base.ISourceOrderApi;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ISourceOrderApi sourceOrderApi = new DecoratorSourceOrderAPIImpl();
        sourceOrderApi.update(2298392389L, new Date(), "API");
    }
}
