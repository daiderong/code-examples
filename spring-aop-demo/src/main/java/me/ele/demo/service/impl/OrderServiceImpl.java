package me.ele.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.service.IOrderService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements IOrderService {

    @Override
    public String addOrder(String orderNo) {
        log.info("生成订单：{}",orderNo);
        try {
            Thread.sleep(1000L);
        }catch (Exception e){
            log.error("order:{}",orderNo,e);
        }
        return orderNo;
    }
}
