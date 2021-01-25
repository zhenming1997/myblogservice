package com.zhen.myblogservice.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhen
 * @since 2021-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Sorts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类ID
     */
    private Long sortId;

    /**
     * 分类名称
     */
    private String sortName;

    /**
     * 分类描述
     */
    private String sortDescription;


}
