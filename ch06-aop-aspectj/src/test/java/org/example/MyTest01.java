package org.example;

import org.example.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:38
 */
public class MyTest01 {

    @Test
    public void test01(){

        String config = "applicationContext.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService proxy = (SomeService) ctx.getBean("someService");

        proxy.doSome("haha",20);

    }

}
