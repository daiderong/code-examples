package me.ele.demo.pay.service.union;

import me.ele.demo.pay.BasePayService;
import me.ele.demo.pay.dto.union.UnionPayCallbackDto;
import me.ele.demo.pay.dto.union.UnionPayCallbackResultDto;
import org.springframework.stereotype.Service;

/**
 * @author daiderong
 */
@Service
public class UnionPayCallbackServiceImpl extends BasePayService<UnionPayCallbackDto, UnionPayCallbackResultDto> {

    @Override
    public Class<UnionPayCallbackDto> getBindParamClass() {
        return UnionPayCallbackDto.class;
    }

    @Override
    public UnionPayCallbackResultDto doProcess(UnionPayCallbackDto payDto) {
        return UnionPayCallbackResultDto.builder().build();
    }

    @Override
    public boolean checkSign(UnionPayCallbackDto payDto) {
        return true;
    }
}
