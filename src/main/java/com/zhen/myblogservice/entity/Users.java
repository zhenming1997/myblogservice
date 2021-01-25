package com.zhen.myblogservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userProfilePhoto;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

    /**
     * 用户生日
     */
    private LocalDate userBirthday;

    /**
     * 用户年龄
     */
    private Integer userAge;

    /**
     * 用户手机号
     */
    private String userTelephoneNumber;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 用户权限
     */
    private String userJurisdiction;


}
