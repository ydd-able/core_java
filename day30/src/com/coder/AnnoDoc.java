package com.coder;

import java.lang.annotation.*;

/**
 * @author N1357
 * @since 2026/4/8
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Inherited
public @interface AnnoDoc {

}

