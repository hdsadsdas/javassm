package com.haha.util;

import java.util.Date;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/1/12 14:08
 */
public class ServiceTools {

    public static void doLog(){
        System.out.println("方法的执行时间："+ new Date());
    }

    public static void doTrans(){
        System.out.println("方法执行完毕，提交事务");
    }

}
