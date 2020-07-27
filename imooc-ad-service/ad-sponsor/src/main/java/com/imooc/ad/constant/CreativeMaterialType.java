package com.imooc.ad.constant;

import lombok.Getter;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-27
 * Time: 7:46 PM
 */
@Getter
public enum  CreativeMaterialType {
    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private int type;
    private String desc;

    CreativeMaterialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
