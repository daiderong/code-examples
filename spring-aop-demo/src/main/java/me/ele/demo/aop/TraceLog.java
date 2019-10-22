package me.ele.demo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 输出参数日志
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TraceLog {

    /**
     * 打印入参
     */
    boolean logArgs() default true;

    /**
     * 打印出参
     */
    boolean logReturn() default true;

    /**
     * 如果有异常时打印异常
     */
    boolean logException() default true;


//    /**
//     * 当返回null时打出输入参数日志
//     */
//    boolean whenReturnNullLogArgs() default false;
//
//
//    /**
//     * 当出现异常时打出输入参数日志
//     */
//    boolean whenExceptionLogArgs() default true;


}
