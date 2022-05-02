package org.example.ba07;

import org.springframework.stereotype.Component;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/1 15:20
 */
//目标类
@Component("someService")
public class SomeServiceImpl {


    public String doFirst(String name, Integer age) {
        System.out.println("====业务方法doFirst()====");

        return "doFirst";
    }


}
