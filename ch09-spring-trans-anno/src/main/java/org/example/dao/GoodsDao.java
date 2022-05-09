package org.example.dao;

import org.example.domain.Goods;

public interface GoodsDao {

    //goods表示本次用户购买的商品信息
    int updateGoods(Goods goods);

    //查询用户信息
   Goods selectGoods(Integer id);

}
