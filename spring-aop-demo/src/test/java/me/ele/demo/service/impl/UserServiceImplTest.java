package me.ele.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.dto.UserDto;
import me.ele.demo.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class UserServiceImplTest extends BaseJunit {

    @Autowired
    private IUserService userService;


    @Test
    public void addUserName() {
        userService.addUser(UserDto.builder().name("王维").age(17).build());
    }

    @Test
    public void addUserNameWithLog() {
        userService.addUserWithLog(UserDto.builder().name("李白").age(19).build());
    }

    @Test
    public void addUserWithLogNoReturnLog() {
        userService.addUserWithLogNoReturnLog(UserDto.builder().name("杜甫").age(20).build());
    }

    @Test(expected = Exception.class)
    public void addUserWithLogException() {
        userService.addUserWithLogException(UserDto.builder().name("白居易").age(25).build());
    }


    @Test
    public void addUserReturnNull() {
        userService.addUserReturnNull(UserDto.builder().name("李清照").age(28).build());
    }

//    @Test
//    public void addUserNameIsEmpty2() {
//        Set<ConstraintViolation<UserDto>>  resultSet = FastValidatorUtils.validate(UserDto.builder().name("").build());
//        log.info("错误信息：{}", resultSet.iterator().next().getMessage());
//        Assert.assertEquals("姓名不能为空",resultSet.iterator().next().getMessage());
//    }
}
