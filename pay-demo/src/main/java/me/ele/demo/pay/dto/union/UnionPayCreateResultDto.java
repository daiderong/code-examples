package me.ele.demo.pay.dto.union;


import lombok.Builder;
import lombok.Data;
import me.ele.demo.pay.dto.BaseCreateOrderResultDto;

@Data
@Builder
public class UnionPayCreateResultDto implements BaseCreateOrderResultDto {

    private String code;

    private String orderNo;

    private String customerNo;


}
