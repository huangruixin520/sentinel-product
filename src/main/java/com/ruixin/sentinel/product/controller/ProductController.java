package com.ruixin.sentinel.product.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;


/**
 * <p>
 *  商品controller
 * </p>
 *
 * @author ruixin
 * @date 2021/2/20
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * sprinboot默认日志
     */
    private Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping("/findProductById/{id}")
    public String findProductById(@PathVariable("id") String id){
        logger.info("请求findProductById....");
        return "iphone12 pro";
    }
}
