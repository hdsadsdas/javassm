package org.example.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:22
 */

@Aspect
@Component
public class MyAspect {


    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        String name = "";
        //获取第一个参数的值
        Object args [] = pjp.getArgs();
        if (args != null && args.length > 1){

            Object arg = args[0];
            name = (String)arg;
        }

        //实现环绕通知

        Object result = null;

        if ("haha".equals(name)){

            System.out.println("符合条件，调用增加切面");

        }

        System.out.println("环绕通知：在目标方法之前，输出时间："+ new Date());

        result = pjp.proceed();

        System.out.println("环绕通知：在目标方法之后，提交事务");

        //修改目标方法的执行结果，影响方法最后调用结果
        if( result != null){

            return "HELLO";
        }

        return result;


    }



}
