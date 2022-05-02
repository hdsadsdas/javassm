package org.example.ba02;

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

    @Override
    public Student doOther2(String name, Integer age) {

        Student student = new Student();
        student.setAge(age);
        student.setName(name);

        return student;
    }

}
