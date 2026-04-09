package com.coder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author N1357
 * @since 2026/4/8
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)//source.class.runtime
public @interface Anno4 {
    String value();
}
