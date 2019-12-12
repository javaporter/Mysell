package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * CreateBy 兰泽平
 * 2019
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);
}
