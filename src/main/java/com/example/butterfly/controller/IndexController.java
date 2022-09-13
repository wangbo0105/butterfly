package com.example.butterfly.controller;


import com.example.butterfly.result.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ResponseResult<String> index() {
        return ResponseResult.OK("application is running");
    }
}
