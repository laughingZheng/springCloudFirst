package com.laughing.service.impl;

import com.laughing.service.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @Author:zhenganke
 * @Description:
 * @Date: 10:59
 * @Modified By:
 */
@Component
public class HiHystrix implements EurekaClientFeign{
    @Override
    public String hi(String name) {
        return "hi,"+name+",error!!!!!!";
    }
}
