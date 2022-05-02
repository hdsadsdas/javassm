package org.example;

import org.example.ba03.SomeService;
import org.example.ba03.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:38
 */
public class MyTest03 {

    @Test
    public void test01(){

        String config = "applicationContext.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService proxy = (SomeService) ctx.getBean("someService");

        String str = proxy.doFirst("haha", 20);

        System.out.println("str====="+str);


    }

}
