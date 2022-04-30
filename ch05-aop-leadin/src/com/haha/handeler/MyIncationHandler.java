package com.haha.handeler;

import com.haha.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/1/12 14:01
 */
public class MyIncationHandler implements InvocationHandler {

    //目标对象
    private Object target;//SomeServiceImpl类

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行了MyIncationHandler中的invoke()");

        //通过代理对象执行方法时，会调用执行这个invoke（）
         Object res = null;

         ServiceTools.doLog();
        //执行目标类的方法，通过method类实现
        res = method.invoke(target,args);

        ServiceTools.doTrans();

        //目标方法的执行结果
        return res;
    }
}
