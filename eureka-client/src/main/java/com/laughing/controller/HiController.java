package com.laughing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 9:42
 * @Modified By:
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam String name){

        return "name:"+name+"---------port:"+port;
    }
}
