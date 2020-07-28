package com.imooc.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-28
 * Time: 12:11 AM
 */
public class CommonUtils {
    public static String md5(String value) {
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
