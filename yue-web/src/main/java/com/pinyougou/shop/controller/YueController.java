package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.yueService;
import com.wwh.pojo.Goods;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/28.
 */
@RestController
@RequestMapping("yue")
public class YueController {
    @Reference
    private yueService sev;


    @RequestMapping(value = "/list")
    public List<Goods> list(){
        List<Goods> list=sev.list();
        return list;
    }
}
