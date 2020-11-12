package com.song.springbootdianping;

import com.song.springbootdianping.mapper.UserMapper;
import com.song.springbootdianping.model.User;
import com.song.springbootdianping.request.UserRegistRequest;
import com.song.springbootdianping.service.OrderService;
import com.song.springbootdianping.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDianpingApplicationTests {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserMapper userMapper;

    /**
     * 并发数
     */
    private final int CONCURRENT_NUMBER = 50;
    @Test
    public void contextLoads() throws InterruptedException {
        System.out.println("############并发模拟开始#################");
        CountDownLatch latch = new CountDownLatch(CONCURRENT_NUMBER);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(CONCURRENT_NUMBER);
        ExecutorService executorService = Executors.newFixedThreadPool(CONCURRENT_NUMBER);

        for (int i = 0; i < CONCURRENT_NUMBER; i++) {
            executorService.execute(() -> {
                try {
                    cyclicBarrier.await();
                    int orderId = orderService.createOrder(1);
                    System.out.println("订单id:" + orderId);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        executorService.shutdown();
        System.out.println("############并发模拟完毕#################");
    }

    @Test
    public void genUser(){
        User user = null;
        for (int i = 100; i < 1000000;i++) {
            user = new User();
            user.setPhone(String.valueOf(i));
            user.setGender(String.valueOf(i));
            user.setNickname(String.valueOf(i));
            user.setPassword(String.valueOf(i));
            user.setUsername(String.valueOf(i));
            userMapper.insert(user);
        }

    }

}
