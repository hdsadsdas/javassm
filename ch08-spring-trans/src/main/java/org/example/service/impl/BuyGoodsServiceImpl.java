package org.example.service.impl;

import org.example.dao.GoodsDao;
import org.example.dao.SaleDao;
import org.example.domain.Goods;
import org.example.domain.Sale;
import org.example.excep.NotEnoughException;
import org.example.service.BuyGoodsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/14 17:17
 */

@Component("buyService")
public class BuyGoodsServiceImpl implements BuyGoodsService {

    @Resource
    private SaleDao saleDao;
    @Resource
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {

        System.out.println("========buy方法的开始========");

        //记录销售的信息，向sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            //商品不存在
            throw new NullPointerException(goodsId + "商品不存在");
        }else if (goods.getAmount() < nums){
            throw new NotEnoughException(goodsId + "商品库存不足");
        }

        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);

        System.out.println("========buy方法的结束========");

    }


    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
