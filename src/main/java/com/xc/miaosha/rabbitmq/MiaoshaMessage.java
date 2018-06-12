package com.xc.miaosha.rabbitmq;

import com.xc.miaosha.domain.MiaoshaUser;

/**
 * Created by xc on 2018/6/12.
 */
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
    public MiaoshaUser getUser() {
        return user;
    }
    public void setUser(MiaoshaUser user) {
        this.user = user;
    }
    public long getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
