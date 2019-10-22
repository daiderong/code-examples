package me.ele.demo.pay.service;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.pay.IPayStrategyService;
import me.ele.demo.pay.dto.alipay.AlipayCallbackDto;
import me.ele.demo.pay.dto.alipay.AlipayCallbackResultDto;
import me.ele.demo.pay.dto.alipay.AlipayCreateOrderDto;
import me.ele.demo.pay.dto.alipay.AlipayCreateResultDto;
import me.ele.demo.pay.dto.union.UnionPayCallbackDto;
import me.ele.demo.pay.dto.union.UnionPayCallbackResultDto;
import me.ele.demo.pay.dto.union.UnionPayCreateOrderDto;
import me.ele.demo.pay.dto.union.UnionPayCreateResultDto;
import me.ele.demo.pay.BaseJunit;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class PayStrategySerivceImplTest extends BaseJunit {

    @Autowired
    private IPayStrategyService payStrategyService;

    @Test
    public void alipayOrderTest() throws Exception {
        AlipayCreateResultDto alipayCreateResultDto = (AlipayCreateResultDto) payStrategyService.createOrder(AlipayCreateOrderDto.builder()
                .amount(1000L)
                .orderId("12121212").build());
        AlipayCallbackResultDto alipayCallbackResultDto = (AlipayCallbackResultDto) payStrategyService.reciveCallback(AlipayCallbackDto.builder().errorCode("0000")
                .build());

    }

    @Test
    public void unionpayOrderTest() throws Exception {
        UnionPayCreateResultDto unionPayCreateResultDto = (UnionPayCreateResultDto) payStrategyService.createOrder(UnionPayCreateOrderDto.builder()
                .totalAmount(1281L)
                .orderNo("3123123").build());
        UnionPayCallbackResultDto unionPayCallbackResultDto = (UnionPayCallbackResultDto) payStrategyService.reciveCallback(UnionPayCallbackDto.builder().errorCode("0000")
                .build());

    }


}