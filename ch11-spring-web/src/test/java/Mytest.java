import org.example.domain.Student;
import org.example.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/16 19:33
 */
public class Mytest {

    @Test
    public void test(){

        String config = "spring.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        StudentService service = (StudentService) ctx.getBean("studentService");

        Student student = new Student();
        student.setId(Integer.parseInt("1018"));
        student.setName("strName");
        student.setEmail("strEmail");
        student.setAge(Integer.parseInt("20"));

        int i = service.addStudent(student);

        System.out.println(i);

    }

}
