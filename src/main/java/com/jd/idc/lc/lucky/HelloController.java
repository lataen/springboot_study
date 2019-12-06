package com.jd.idc.lc.lucky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping({"/hello", "/hi"})
    public String say() {
        return limitConfig.getDesc();
    }

    @GetMapping("/user/{id}")
    public String user(@PathVariable("id") Integer id) {
        return "user" + id;
    }

    @PostMapping("say")
    public String say(@RequestParam(value = "word", required = false, defaultValue = "nothing to say") String word) {
        return word+1994;
    }
}
