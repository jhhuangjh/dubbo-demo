package org.jh.providerbootxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-boot-provider.xml"})
public class ProviderBootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootXmlApplication.class, args);
    }

}
