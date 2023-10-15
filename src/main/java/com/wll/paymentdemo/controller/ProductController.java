package com.wll.paymentdemo.controller;

import com.wll.paymentdemo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglanlan
 * @Description：
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("api/product")
public class ProductController {

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public Result test() {
        return "hello";
    }
}
