package com.chaoqunhuang.mxb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chaoqunhuang on 4/23/18.
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "MXBBank has started successfully";
    }
}
