package org.jh.providerbootxml.service.impl;

import org.jh.service.IUserService;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/29 19:07
 */
public class UserServiceImpl implements IUserService {

    @Override
    public String hello() {
        return "Hello, dubbo-boot-xml!";
    }

}
