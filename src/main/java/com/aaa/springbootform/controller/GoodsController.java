package com.aaa.springbootform.controller;

import com.aaa.springbootform.entity.Goods;
import com.aaa.springbootform.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 张家宝
 * @date 2020-07-01
 */
@Controller
@RequestMapping("goods")
public class GoodsController {
    @Autowired GoodsService service;

    @RequestMapping("findAll")
    public String findAll(Model model){
        model.addAttribute("list",service.findAll());
        return "list";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("add")
    public ModelAndView add(Goods goods){
        service.insert(goods);
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("redirect:/goods/findAll");
    }

    @RequestMapping("toUpdate")
    public String toUpdate(Model model, Goods goods){
        Goods goods1 = service.findOne(goods);
        model.addAttribute("goods",goods1);
        return "update";
    }

    @RequestMapping("update")
    public ModelAndView update(Goods goods){
        service.update(goods);
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("redirect:/goods/findAll");
    }

    @RequestMapping("delete")
    public ModelAndView delete(Goods goods){
        service.delete(goods);
        ModelAndView modelAndView = new ModelAndView();
        return new ModelAndView("redirect:/goods/findAll");
    }


}
