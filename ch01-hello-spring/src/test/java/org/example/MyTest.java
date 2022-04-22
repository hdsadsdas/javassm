package org.example;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/8 16:33
 */

import org.example.service.SomeService;
import org.example.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class MyTest {

    @Test
    public void test01(){

        SomeService servic = new SomeServiceImpl();
        servic.doSome();

    }

    /*在创建容器时，会创建配置文件中的所有对象*/

    @Test
    public void test02(){

        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就表示spring容器，通过容器就能获取对象
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，你要调用对象的方法
        //getBean(""配置文件中的bean的id值)
        SomeService someService = (SomeService) ac.getBean("someService");

        //使用spring创建好的对象
        someService.doSome();
    }

    /*获取spring容器中java对象的信息*/

    @Test
    public void test03(){

        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取容器中定义的对象数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量"+nums);

        String[] names = ac.getBeanDefinitionNames();

        for (String name : names){
            System.out.println(name);
        }


    }

}
