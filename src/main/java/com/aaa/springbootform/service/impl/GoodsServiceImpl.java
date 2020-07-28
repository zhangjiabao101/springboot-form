package com.aaa.springbootform.service.impl;

import com.aaa.springbootform.entity.Goods;
import com.aaa.springbootform.mapper.GoodsMapper;
import com.aaa.springbootform.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张家宝
 * @date 2020-07-01
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired GoodsMapper mapper;
    @Override
    public int insert(Goods goods) {
        return mapper.insert(goods);
    }

    @Override
    public int update(Goods goods) {
        return mapper.update(goods);
    }

    @Override
    public int delete(Goods goods) {
        return mapper.delete(goods);
    }

    @Override
    public List<Goods> findAll() {
        return mapper.findAll();
    }

    @Override
    public Goods findOne(Goods goods) {
        return mapper.findOne(goods);
    }
}
