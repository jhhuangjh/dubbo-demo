package org.jh.consumer;

import org.jh.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/24 22:54
 */
public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        // 获取远程服务
        IUserService userService = context.getBean(IUserService.class);
        System.out.println("获取服务器的反馈信息" + userService.hello());
        System.in.read();
    }

}
