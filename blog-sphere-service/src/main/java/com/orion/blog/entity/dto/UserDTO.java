package com.orion.blog.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户缓存表
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/5/24 17:29
 */
@Data
public class UserDTO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户类型
     *
     * @see com.orion.blog.consts.UserType
     */
    private Integer userType;

}
