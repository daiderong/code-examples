package me.ele.demo.pay.service.union;

import me.ele.demo.pay.BasePayService;
import me.ele.demo.pay.dto.union.UnionPayCreateOrderDto;
import me.ele.demo.pay.dto.union.UnionPayCreateResultDto;
import org.springframework.stereotype.Service;

@Service
public class UnionPayCreateOrderServiceImpl extends BasePayService<UnionPayCreateOrderDto, UnionPayCreateResultDto> {

    @Override
    public Class<UnionPayCreateOrderDto> getBindParamClass() {
        return UnionPayCreateOrderDto.class;
    }

    @Override
    public UnionPayCreateResultDto doProcess(UnionPayCreateOrderDto basePayDto) {
        return UnionPayCreateResultDto.builder().build();
    }

    @Override
    public boolean checkSign(UnionPayCreateOrderDto payDto) {
        return true;
    }
}
