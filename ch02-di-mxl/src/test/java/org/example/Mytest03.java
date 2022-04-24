package org.example;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/10 18:31
 */

import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Mytest03 {

    @Test
    public void Test01(){

     String config = "ba03/applicationContext.xml";
     ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        Student myStudent2 = (Student) ac.getBean("myStudent2");
        File myFile = (File) ac.getBean("myFile");

        System.out.println(myStudent);
        System.out.println(myStudent2);
        System.out.println(myFile.getName());
    }


}
