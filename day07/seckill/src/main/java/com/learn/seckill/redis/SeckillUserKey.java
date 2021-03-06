package com.learn.seckill.redis;

/**
 * @author Administrator
 */
public class SeckillUserKey extends BasePrefix {
    public static final int TOKEN_EXPIRE = 1800;
    private SeckillUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    /**
     * 设置token并设置过期时间
     */
    public static final SeckillUserKey token = new SeckillUserKey(TOKEN_EXPIRE, "token");

    public static final SeckillUserKey getByMobile= new SeckillUserKey(TOKEN_EXPIRE, "mobile");
}
