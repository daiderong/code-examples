package me.ele.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.service.IOrderService;
import net.bytebuddy.utility.RandomString;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j

public class OrderServiceImplTest extends BaseJunit {

    @Autowired
    private IOrderService orderService;

//    @Autowired
//    private OrderServiceUtils orderServiceUtils;

//    @Test
//    public void addOrder() {
//        orderService.addOrder(RandomString.make(10));
////        orderServiceUtils.addOrder("ttttt");
//    }


    @Test
    public void testLoopAll() throws Exception {
        for (int i = 0; i < 1000; i++) {
            orderService.addOrder(RandomString.make(10));
            Thread.sleep(5000);
        }
    }
}
