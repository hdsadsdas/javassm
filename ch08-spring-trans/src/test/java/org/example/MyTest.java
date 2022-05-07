package org.example;

import org.example.dao.GoodsDao;
import org.example.domain.Goods;
import org.example.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/14 17:33
 */
public class MyTest {

    @Test
    public void test01(){

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //容器中获取service
        GoodsDao service = (GoodsDao) ctx.getBean("goodsDao");

        Goods goods = service.selectGoods(1001);

        System.out.println(goods.toString());


    }

}
