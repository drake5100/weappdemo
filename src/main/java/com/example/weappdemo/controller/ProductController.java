package com.example.weappdemo.controller;

import com.example.weappdemo.bean.ProductExample;
import com.example.weappdemo.common.ResponseData;
import com.example.weappdemo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductMapper productMapper;
    @RequestMapping("/productList")
    @ResponseBody
    public ResponseData productList(){
        return ResponseData.ok(productMapper.selectByExample(null));
    }
}
