package com.github.paicoding.forum.core.permission;

import java.lang.annotation.*;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permission {
    /**
     * 限定权限
     *
     * @return
     */
    UserRole role() default UserRole.ALL;
}
