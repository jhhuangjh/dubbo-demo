package org.jh.consumerbootannotation;


import com.alibaba.dubbo.config.annotation.Reference;
import org.jh.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerBootAnnotationApplicationTests {

    @Reference
    private IUserService userService;

    @Test
    public void contextLoads() throws IOException {
        System.out.println(userService.hello());
        System.in.read();
    }

}
