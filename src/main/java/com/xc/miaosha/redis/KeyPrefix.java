package com.xc.miaosha.redis;

public interface KeyPrefix {
    public int expireSeconds();

    public String getPrefix();
}
