package me.ele.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author daiderong
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotEmpty()
    private String name;


    @Min(value = 1)
    @Max(value = 150)
    private Integer age;






}
