package com.orion.blog.consts;

/**
 * 常量
 *
 * @author Jiahang Li
 * @version 1.0.0
 * @since 2021/3/30 10:07
 */
public class Const extends com.orion.constant.Const {

    private Const() {
    }

    public static final String INVALID_PARAM = "参数不合法";

    public static final String LOGIN_TOKEN = "O-Login-Token";

    public static final String LOGIN_TOKEN_ENC_KEY = "LoginToken";

    public static final int LOGIN_TOKEN_EXPIRE = 60 * 60 * 24;

}
