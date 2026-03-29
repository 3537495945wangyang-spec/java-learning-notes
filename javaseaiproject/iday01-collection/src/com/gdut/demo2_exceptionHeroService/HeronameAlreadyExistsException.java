package com.gdut.demo2_exceptionHeroService;

public class HeronameAlreadyExistsException extends Exception{
    // 1. 无参构造方法 (可选，但建议提供)
    public HeronameAlreadyExistsException() {
        super(); // 调用父类 Exception 的无参构造
    }
    // 2. 带错误信息的构造方法 (必须提供)
    public HeronameAlreadyExistsException(String message) {
        super(message); // 调用父类 Exception 的带 String 参数的构造
    }
    // 3. 带错误信息和原因的构造方法 (强烈推荐，用于异常链)
    public HeronameAlreadyExistsException(String message, Throwable cause) {
        super(message, cause); // 调用父类 Exception 的带 String 和 Throwable 参数的构造
    }
}
