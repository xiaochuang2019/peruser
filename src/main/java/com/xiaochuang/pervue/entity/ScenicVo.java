package com.xiaochuang.pervue.entity;

import lombok.Data;

@Data
public class ScenicVo extends Scenic {

    private String tname;

    //地区
    private String provinceName;
    private String cityName;
    private String districtName;
}
