package com.xiaobaicai.web.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户注册信息
 * </p>
 *
 * @author xiaobaicai
 * @since 2024-11-13
 */
@Getter
@Setter
@TableName("t_user")
public class UserDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号
     */
    @TableField("user_account")
    private String userAccount;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户状态，1=正常，0=注销
     */
    @TableField("user_status")
    private Integer userStatus;

    /**
     * 用户使用的系统类型，1=平台端，2=后台端
     */
    @TableField("system_type")
    private Integer systemType;

    /**
     * 创建人
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    @TableField("update_by")
    private Long updateBy;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    @TableField("is_deleted")
    private Byte isDeleted;

    @TableField("complete_profile")
    private Integer completeProfile;

    /**
     * 盐值
     */
    @TableField("salt")
    private String salt;
}
