package com.laughing.service;

import com.laughing.beanConfig.FeignConfig;
import com.laughing.service.impl.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 14:09
 * @Modified By:
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam("name") String name);
}
