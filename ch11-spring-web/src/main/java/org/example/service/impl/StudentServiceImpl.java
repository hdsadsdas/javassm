package org.example.service.impl;

import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.service.StudentService;

import java.util.List;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/8 16:35
 */
public class StudentServiceImpl implements StudentService {

    //引用类型
    private StudentDao studentDao;

    //使用set注入
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {

        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
