package org.jh.consumerbootxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-boot-consumer.xml"})
public class ConsumerBootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootXmlApplication.class, args);
    }

}
