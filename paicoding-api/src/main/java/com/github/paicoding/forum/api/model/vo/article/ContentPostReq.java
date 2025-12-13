package com.github.paicoding.forum.api.model.vo.article;

import lombok.Data;

import java.io.Serializable;

/**
 * 发布文章请求参数
 *
 * @author Vio
 *
 * @date 2025-11-10
 */
@Data
public class ContentPostReq implements Serializable {
    /**
     * 正文内容
     */
    private String content;
}