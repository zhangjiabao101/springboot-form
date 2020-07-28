package com.aaa.springbootform.service;

import com.aaa.springbootform.entity.Goods;

import java.util.List;

/**
 * @author 张家宝
 * @date 2020-07-01
 */
public interface GoodsService {
    int insert(Goods goods);

    int update(Goods goods);

    int delete(Goods goods);

    List<Goods> findAll();

    Goods findOne(Goods goods);
}
