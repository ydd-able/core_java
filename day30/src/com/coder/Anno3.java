package com.coder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author N1357
 * @since 2026/4/8
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,
ElementType.TYPE_PARAMETER})//表明这个注解只能用于类上面或者接口，后者适用于方法。
public @interface Anno3 {

}
