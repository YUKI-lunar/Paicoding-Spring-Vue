package com.github.paicoding.forum.api.model.exception;

import com.github.paicoding.forum.api.model.vo.constants.StatusEnum;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
public class ExceptionUtil {

    public static ForumException of(StatusEnum status, Object... args) {
        return new ForumException(status, args);
    }

}
