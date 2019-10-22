package me.ele.demo.pay.service.wechat;

import me.ele.demo.pay.BasePayService;
import me.ele.demo.pay.dto.wechat.WechatCreateOrderDto;
import me.ele.demo.pay.dto.wechat.WechatPayCreateResultDto;
import org.springframework.stereotype.Service;

@Service
public class WechatPayCreateOrderServiceImpl extends BasePayService<WechatCreateOrderDto, WechatPayCreateResultDto> {

    @Override
    public Class<WechatCreateOrderDto> getBindParamClass() {
        return WechatCreateOrderDto.class;
    }

    @Override
    public WechatPayCreateResultDto doProcess(WechatCreateOrderDto basePayDto) {
        return WechatPayCreateResultDto.builder().build();
    }

    @Override
    public boolean checkSign(WechatCreateOrderDto payDto) {
        return true;
    }
}
