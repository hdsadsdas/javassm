package com.haha;

import com.haha.handeler.MyIncationHandler;
import com.haha.service.SomeService;
import com.haha.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/1/12 13:47
 */
public class MyApp {

    public static void main(String[] args) {
        //调用doSome，doOther
//        SomeService someService = new SomeServiceImpl();
//        someService.doSome();
//        System.out.println("=======================");
//        someService.doOther();

        //使用jdk的Proxy创建代理对象
        //创建目标对象
        SomeServiceImpl target = new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyIncationHandler(target);

        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);

        //通过代理执行方法 ， 会调用handler中invoke()
        proxy.doSome();
        System.out.println("=======================");
        proxy.doOther();

    }

}
