package org.example.ba02;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/10 11:02
 */

public class Student {

    private String name;
    private int age;

    //引用类型
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}