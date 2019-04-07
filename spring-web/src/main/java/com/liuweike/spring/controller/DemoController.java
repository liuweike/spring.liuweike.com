package com.liuweike.spring.controller;

import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Description: // 测试控制器
 * <p>
 * Created by liuweike on 2019-04-07.
 * Create time: 21:22
 */
@RestController
@Log4j2
@RequestMapping("/spring")
public class DemoController {

    @RequestMapping(value = "test")
    public Map<String, String> test(){
        log.info("liuweike");
        Map<String ,String> result = Maps.newHashMap();
        result.put("name", "liuweike");
        return result;
    }
}
