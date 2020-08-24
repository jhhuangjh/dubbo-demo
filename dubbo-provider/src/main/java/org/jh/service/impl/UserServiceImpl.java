package org.jh.service.impl;

import org.jh.service.IUserService;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/24 21:43
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String hello() {
        return "hello,dubbo!";
    }

}
