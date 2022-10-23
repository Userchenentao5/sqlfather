package com.yupi.sqlfather.model.dto;

import com.yupi.sqlfather.common.PageRequest;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询请求
 *
 * @author https://github.com/liyupi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FieldInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 同时搜索名称或字段名称
     */
    private String searchName;

    /**
     * 名称
     */
    private String name;

    /**
     * 字段名称
     */
    private String fieldName;

    /**
     * 内容，支持模糊查询
     */
    private String content;

    /**
     * 状态（0-待审核, 1-通过, 2-拒绝）
     */
    private Integer reviewStatus;

    /**
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}