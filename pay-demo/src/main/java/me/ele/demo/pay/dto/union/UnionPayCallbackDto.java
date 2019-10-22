package me.ele.demo.pay.dto.union;


import lombok.Builder;
import lombok.Data;
import me.ele.demo.pay.dto.BaseCallbackDto;

@Builder
@Data
public class UnionPayCallbackDto implements BaseCallbackDto {

    private String errorCode;

    private String orderNo;

}
