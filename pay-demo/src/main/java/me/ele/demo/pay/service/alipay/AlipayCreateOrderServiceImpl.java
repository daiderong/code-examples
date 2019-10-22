package me.ele.demo.pay.service.alipay;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.pay.BasePayService;
import me.ele.demo.pay.dto.alipay.AlipayCreateResultDto;
import me.ele.demo.pay.dto.alipay.AlipayCreateOrderDto;
import org.springframework.stereotype.Service;

/**
 * 支付宝下单逻辑处理Service
 */
@Slf4j
@Service
public class AlipayCreateOrderServiceImpl extends BasePayService<AlipayCreateOrderDto, AlipayCreateResultDto> {

    @Override
    public Class<AlipayCreateOrderDto> getBindParamClass() {
        return AlipayCreateOrderDto.class;
    }

    @Override
    public AlipayCreateResultDto doProcess(AlipayCreateOrderDto basePayDto) {
        //省略业务逻辑
        log.info("处理支付宝业务逻辑.....");
        return AlipayCreateResultDto.builder().build();
    }

    @Override
    public boolean checkSign(AlipayCreateOrderDto payDto) {
        return true;
    }
}