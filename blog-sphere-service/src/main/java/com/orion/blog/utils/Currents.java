package com.orion.blog.utils;

import com.orion.blog.consts.Const;
import com.orion.blog.consts.UserHolder;
import com.orion.blog.entity.dto.UserDTO;
import com.orion.servlet.web.CookiesExt;
import com.orion.utils.Strings;

import javax.servlet.http.HttpServletRequest;

/**
 * 环境工具类
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/4/2 9:52
 */
public class Currents {

    private Currents() {
    }

    /**
     * 获取当前登录token
     *
     * @param request request
     * @return token
     */
    public static String getLoginToken(HttpServletRequest request) {
        return getToken(request, Const.LOGIN_TOKEN);
    }

    /**
     * 获取token
     *
     * @param request request
     * @param token   tokenKey
     * @return token
     */
    public static String getToken(HttpServletRequest request, String token) {
        String t = request.getHeader(token);
        if (Strings.isEmpty(t)) {
            t = CookiesExt.get(request, token);
        }
        return t;
    }

    /**
     * 获取当前登录用户
     *
     * @return 用户
     */
    public static UserDTO getUser() {
        return UserHolder.get();
    }

    /**
     * 获取当前登录用户id
     *
     * @return id
     */
    public static Long getUserId() {
        return UserHolder.get().getId();
    }

}
