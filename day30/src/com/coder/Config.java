package com.coder;

import java.lang.annotation.*;

/**
 * @author N1357
 * @since 2026/4/9
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Config {
    String className();
    String propertyName();
    String propertyValue();


}
