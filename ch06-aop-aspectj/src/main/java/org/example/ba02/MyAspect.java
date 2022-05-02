package org.example.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
            returning = "res")
    public void myAfterReturing(Object res) {

        System.out.println("后置通知：在目标方法之后执行的，获取返回值是：" + res);

        if ("abcd".equals(res)) {

            //修改目标方法的返回值，看一下是否会影响  最后方法的调用结果
            res = "HELLO";

        }

    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",
            returning = "res")
    public void myAfterReturing2(Object res) {

        System.out.println("后置通知：在目标方法之后执行的，获取返回值是：" + res);

        //修改目标方法的返回值，看一下是否会影响  最后方法的调用结果
        //结果是   引用类型会改变   值类型不会改变

        Student student = (Student) res;
        student.setName("xixi");
        student.setAge(30);

    }


}
