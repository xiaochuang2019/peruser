package com.xiaochuang.pervue.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultEntity implements Serializable {
    //返回说明
    private String reason;
    //返回code码
    private Integer code;
    //返回数据
    private Object result;

    public ResultEntity() {
    }

    public ResultEntity(String reason, Integer code, Object result) {
        this.reason = reason;
        this.code = code;
        this.result = result;
    }
    public static ResultEntity ok(Object result){

        return  new ResultEntity("success",10001,result);
    }
    public static ResultEntity error(){

        return  new ResultEntity("error",10002,null);
    }
}
