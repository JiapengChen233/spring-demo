package com.cjp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author ronaldo
 * @since 2021-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_USER")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @TableField("NAME")
    private String name;

    @TableField("SEX")
    private String sex;

    @TableField("AGE")
    private Integer age;

    @TableField("ID_CARD")
    private String idCard;

    @TableField("ADDRESS")
    private String address;


}
