package com.song.springbootdianping.service;

import com.song.springbootdianping.mapper.OrderItemMapper;
import com.song.springbootdianping.mapper.OrderMapper;
import com.song.springbootdianping.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 订单相关服务
 * @Date 2020/9/26 13:51
 * @Created by Jeremy
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private ProductMapper productMapper;

    public Integer createOrder(Integer buyCount) {

        return null;
    }
}
