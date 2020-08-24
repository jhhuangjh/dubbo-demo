package org.jh.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hjh
 * @version 1.0
 * @date 2020/8/24 22:05
 * 启动Spring容器，自动发布服务
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        System.out.println("Provider started");
        System.in.read(); // press any key to exit
    }
}
