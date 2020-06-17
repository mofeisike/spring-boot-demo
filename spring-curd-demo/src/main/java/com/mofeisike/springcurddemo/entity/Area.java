package com.mofeisike.springcurddemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * description: Area <br>
 * date: 2020/6/17 13:32 <br>
 */
@Data
@ApiModel(value = "区域信息",description = "中国大城市的区域信息")
public class Area {

    @ApiModelProperty(value = "主键",example = "10086")
    private Integer areaId;

    @ApiModelProperty(value = "名称",example = "某地")
    private String areaName;

    @ApiModelProperty(value = "权重",example = "10")
    private Integer priority;

    @ApiModelProperty(value = "创建时间",example = "2020-09-09")
    private Date createTime;

    @ApiModelProperty(value = "更新时间",example = "2020-08-09")
    private Date lastEditTime;

}
