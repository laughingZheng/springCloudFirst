package com.laughing.controller;

import com.laughing.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 9:56
 * @Modified By:
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam("name") String name){
        return hiService.hi(name);
    }

}
