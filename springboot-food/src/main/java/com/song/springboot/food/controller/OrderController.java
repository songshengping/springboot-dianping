package com.song.springboot.food.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 订单接口类
 * @Date 2020/9/26 13:51
 * @Created by Jeremy
 */
@RestController
@Api(value = "订单接口", tags = "订单相关的增删改查")
@RequestMapping(value = "/order")
public class OrderController {

}
