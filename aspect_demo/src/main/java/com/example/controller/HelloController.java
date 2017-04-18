package com.example.controller;

import com.example.annotations.AroundLogging;
import com.example.dto.HelloDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/4/18
 * Time                 : 15:16
 * Description          : 日志测试controller
 */
@RestController
@Slf4j
public class HelloController {


    @AroundLogging
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public HelloDTO hello(@RequestParam String name, @RequestParam String apple, @RequestParam String banana, @RequestParam String orange) {

        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setApple(apple);
        helloDTO.setName(name);
        helloDTO.setBanana(banana);
        helloDTO.setOrange(orange);
        return helloDTO;
    }
}
