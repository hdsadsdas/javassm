package com.haha.service.impl;

import com.haha.service.SomeService;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/1/12 13:46
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");

    }
}
