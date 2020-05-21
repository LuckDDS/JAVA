package com.dy.model;

/**
 * @author DongDeShuai
 * @Date:2020/5/13 3:33 下午
 */
public class DyShop {
    /**
     * 用户id
     */
    private String userId;
    private String shopName;
    private int shopId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUserId() {
        return userId;
    }

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }
}
