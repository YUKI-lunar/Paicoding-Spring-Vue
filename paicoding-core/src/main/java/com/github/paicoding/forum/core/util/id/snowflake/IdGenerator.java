package com.github.paicoding.forum.core.util.id.snowflake;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
public interface IdGenerator {
    /**
     * 生成分布式id
     *
     * @return
     */
    Long nextId();
}
