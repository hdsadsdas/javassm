package org.example.ba05;/*
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2021/12/10 18:28
 */

public class School {

    private String name;
    private String address;



    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
