package org.jh.providerbootannotation.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.jh.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/29 22:04
 */
@Component
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String hello() {
        return "hello,dubbo-boot-annotation";
    }

}
