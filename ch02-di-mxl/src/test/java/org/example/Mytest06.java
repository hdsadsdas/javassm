package org.example;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/10 18:31
 */

import org.example.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest06 {

    @Test
    public void Test01(){

        //加载的是总文件
     String config = "ba06/total.xml";
     ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");

        System.out.println(myStudent);

    }


}
