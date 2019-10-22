package me.ele.demo.service;

import me.ele.demo.dto.UserDto;

/**
 * @author daiderong
 */
public interface IUserService {


    long addUser(UserDto userDto);

    long addUserWithLog(UserDto userDto);

    long addUserWithLogNoReturnLog(UserDto userDto);

    long addUserWithLogException(UserDto userDto);

    Object addUserReturnNull(UserDto userDto);
}
