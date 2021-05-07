package com.freeskl.freeadmin.annotation;


import java.lang.annotation.*;

/**
 * @ClassName Log
 * @Description Log注解
 * @Author freeskl
 * @Date 2021/4/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Log {
    String value();
}
