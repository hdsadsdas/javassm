package org.example.ba03;

import org.example.ba02.Student;
import org.springframework.stereotype.Component;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:20
 */
//目标类
@Component("someService")
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {


        System.out.println("=====目标方法doSome()====");

    }

    @Override
    public String doOther(String name, Integer age) {

        System.out.println("=====目标方法doOther()====");
        return "abcd";
    }

    public String doFirst(String name, Integer age) {
        System.out.println("====业务方法doFirst()====");

        return "doFirst";
    }


}
