package com.zhen.myblogservice.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.mysql.cj.exceptions.DataTruncationException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.omg.CORBA.IDLType;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhen
 * @since 2021-01-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博文ID
     */
    @TableId(type = IdType.AUTO)
    private Long articleId;

    /**
     * 发表用户ID
     */
    private Long userId;

    /**
     * 博客标题
     */
    private String articleTitle;

    /**
     * 博客内容
     */
    private String articleContent;

    /**
     * 浏览量
     */
    private Long articleViews;

    /**
     * 评论总数
     */
    private Long articleCommentCount;

    /**
     * 点赞数
     */
    private Long articleLikeCount;

    /**
     * 乐观锁version
     */
    @Version
    private Integer version;

    /**
    * 逻辑删除
    * */
    @TableLogic
    private Integer deleted;

    /**
     * 发布状态
     * */
    private Long releaseStatus;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
