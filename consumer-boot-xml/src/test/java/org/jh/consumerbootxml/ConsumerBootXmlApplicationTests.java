package org.jh.consumerbootxml;


import org.jh.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerBootXmlApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() throws IOException {
        System.out.println(userService.hello());
        System.in.read();
    }

}
