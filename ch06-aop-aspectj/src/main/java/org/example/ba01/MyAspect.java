package org.example.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

   //给指定类增加功能
    @Before(value = "execution(void doSome(String,Integer))")
    //1.@Before:前置通知，在目标方法之前先执行切面的功能
    //2.表示切面位置的切入点表达式: execution(访问修饰符返回值包名类名.方法名称(方法的参数)异常)
    public void myBefore(){

        //切面执行的功能代码
        System.out.println("单个类增加 前置通知：切面功能：在目标方法之前输出执行时间："+ new Date());


    }

    //给多个类增加功能
    @Before(value = "execution(* org.example.ba01.*ServiceImpl.*(..)))")
    //1.@Before:前置通知，在目标方法之前先执行切面的功能
    //2.表示切面位置的切入点表达式: execution(访问修饰符返回值包名类名.方法名称(方法的参数)异常)
    public void myBefore2(){

        //切面执行的功能代码
        System.out.println("多个类增加 前置通知：切面功能：在目标方法之前输出执行时间："+ new Date());


    }

    //切面中的参数
    @Before(value = "execution(* org.example.ba01.*ServiceImpl.*(..)))")
    //1.@Before:前置通知，在目标方法之前先执行切面的功能
    //2.表示切面位置的切入点表达式: execution(访问修饰符返回值包名类名.方法名称(方法的参数)异常)
    public void myBefore3(JoinPoint jp){

        System.out.println("方法的签名="+jp.getSignature());
        System.out.println("方法的名称="+jp.getSignature().getName());
        //获取方法的实参
        Object[] args = jp.getArgs();
        for (Object arg:args){
            System.out.println("参数="+arg);
        }

    }

}
