package org.example;

import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/8 17:11
 */
public class MyTest {

    @Test
    public void test01() {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        String[] names = ctx.getBeanDefinitionNames();

        for (String na : names) {
            System.out.println("容器中对象的名称" + na + "|" + ctx.getBean(na));
        }

    }

    @Test
    public void test02() {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        StudentDao dao = (StudentDao) ctx.getBean("studentDao");

        Student student = new Student(1008, "啦啦啦", "@dasdasdas", 20);

        int nums = dao.insertStudent(student);

        System.out.println("nums" + nums);

    }

    @Test
    public void test03() {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        StudentService service = (StudentService) ctx.getBean("studentService");

        Student student = new Student(1009, "啦啦啦", "@dasdasdas", 20);

        int nums = service.addStudent(student);

        System.out.println("nums" + nums);

    }

    @Test
    public void test04() {

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        StudentService service = (StudentService) ctx.getBean("studentService");

        List<Student> students = service.queryStudents();

        for (Student student : students) {

            System.out.println(student);

        }

    }

}
