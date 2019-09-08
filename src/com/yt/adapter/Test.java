package com.yt.adapter;

public class Test {
    public static void main(String[] args) {
        IAdapterOrderAPIForAPP adapterOrderAPIForAPP = new AdapterOrderAPIForAPPImpl();
        adapterOrderAPIForAPP.update(2389239832893L, "APP");
    }
}
