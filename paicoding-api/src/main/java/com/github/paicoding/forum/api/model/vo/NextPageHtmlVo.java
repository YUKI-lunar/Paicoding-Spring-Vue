package com.github.paicoding.forum.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextPageHtmlVo implements Serializable {
    private String html;
    private Boolean hasMore;
}
