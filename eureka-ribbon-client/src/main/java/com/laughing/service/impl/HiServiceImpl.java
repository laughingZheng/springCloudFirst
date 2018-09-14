package com.laughing.service.impl;

import com.laughing.service.HiService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 10:18
 * @Modified By:
 */
@Service
public class HiServiceImpl implements HiService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",error!";
    }

}
