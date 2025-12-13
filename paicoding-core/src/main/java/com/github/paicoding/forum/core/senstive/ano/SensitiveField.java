package com.github.paicoding.forum.core.senstive.ano;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface SensitiveField {
    /**
     * 绑定的db中的哪个字段
     *
     * @return
     */
    String bind() default "";

}
