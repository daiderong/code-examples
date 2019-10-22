package me.ele.demo.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.ele.demo.aop.TraceLog;
import me.ele.demo.dto.UserDto;
import me.ele.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {


    @Override
    public long addUser(UserDto userDto) {
        return 1L;
    }

    @TraceLog
    @Override
    public long addUserWithLog(UserDto userDto) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        return 2L;
    }

    @TraceLog(logReturn = false)
    @Override
    public long addUserWithLogNoReturnLog(UserDto userDto) {
        return 3;
    }

    @TraceLog
    @Override
    public long addUserWithLogException(UserDto userDto) {
        return 1 / 0;
    }

    @TraceLog
    @Override
    public Object addUserReturnNull(UserDto userDto) {
        log.info("执行 addUserVoid");
        return null;
    }
}
