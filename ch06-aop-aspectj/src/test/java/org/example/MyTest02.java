package org.example;

import org.example.ba02.SomeService;
import org.example.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:38
 */
public class MyTest02 {

    @Test
    public void test01(){

        String config = "applicationContext.xml";

        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService proxy = (SomeService) ctx.getBean("someService");

        String str = proxy.doOther("haha", 20);
        System.out.println(str);

        Student student = proxy.doOther2("haha", 20);
        System.out.println(student.toString());


    }

}
