package com.aaa.springbootform.mapper;

import com.aaa.springbootform.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 张家宝
 * @date 2020-07-01
 */
@Mapper
public interface GoodsMapper {
    int insert(Goods goods);
    int update(Goods goods);
    int delete(Goods goods);
    List<Goods> findAll();
    Goods findOne(Goods goods);
}
