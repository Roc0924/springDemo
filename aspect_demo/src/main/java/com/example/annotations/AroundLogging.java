package com.example.annotations;

import java.lang.annotation.*;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/4/18
 * Time                 : 15:49
 * Description          : 日志注解 用于方法，打印切入点[类.方法], 参数，耗时
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AroundLogging {

}
