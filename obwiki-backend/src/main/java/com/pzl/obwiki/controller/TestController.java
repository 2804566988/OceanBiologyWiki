package com.pzl.obwiki.controller;

import com.pzl.obwiki.req.DemoReq;
import com.pzl.obwiki.resp.CommonResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@Api("测试Web接口")//Swagger声明类加@Api注解, 并说明
public class TestController {

    @PostMapping("/sayHello")
    @ApiOperation("最简单的测试方法") //Swagger声明方法添加@ApiOperation注解,并说明
    public CommonResp sayHello(@Valid @RequestBody DemoReq demoReq){
        //返回提交参数
        return new CommonResp(true,"查询成功",demoReq);
    }
}