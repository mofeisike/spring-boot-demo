package com.mofeisike.springcurddemo.utill;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description: ResponseResult <br>
 * date: 2020/6/17 14:07 <br>
 */

@Data
@ApiModel(value = "返回数据",description = "整合了各种数据")
public class ResponseResult {

    @ApiModelProperty(value = "请求状态")
    private boolean success;

    @ApiModelProperty(value = "返回提示信息")
    private String msg;

    @ApiModelProperty(value = "返回数据")
    private Object data;

    public ResponseResult(boolean success,String msg,Object data){
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(boolean success,String msg){
        this.success = success;
        this.msg =msg;
    }

    public ResponseResult(boolean success){
        this.success =success;
    }

}
