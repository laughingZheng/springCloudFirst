package com.laughing.controller;

import com.laughing.service.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 14:14
 * @Modified By:
 */
@RestController
public class HiController {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam("name") String name){
        return eurekaClientFeign.hi(name);
    }
}
