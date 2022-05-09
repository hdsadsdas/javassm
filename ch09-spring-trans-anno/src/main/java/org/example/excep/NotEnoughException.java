package org.example.excep;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/3/14 17:20
 */

//自定义的运行时的异常
public class NotEnoughException extends RuntimeException {


    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
