package org.example;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/8 16:33
 */

import org.example.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    @Test
    public void test01(){

        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "ba01/applicationContext.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就表示spring容器，通过容器就能获取对象
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，你要调用对象的方法
        //getBean(""配置文件中的bean的id值)
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);

    }


 }


