package com.xc.sb1.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "resource")
public class Resource {
    public   String imageServer;
    public  String emailServer;
}
