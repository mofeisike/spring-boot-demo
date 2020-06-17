package com.mofeisike.springcurddemo.Controller;

import com.mofeisike.springcurddemo.entity.Area;
import com.mofeisike.springcurddemo.service.AreaService;
import com.mofeisike.springcurddemo.utill.FormatResponseUtil;
import com.mofeisike.springcurddemo.utill.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: AreaController <br>
 * date: 2020/6/17 14:05 <br>
 */

@RestController
@RequestMapping("/area")
@Api(tags = "区域信息")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping
    @ApiOperation(value = "全部数据", response = ResponseResult.class, responseContainer = "List")
    public ResponseResult ququeryAll(){
        return FormatResponseUtil.formatResponse(areaService.queryAll());
    }

    @GetMapping("/id")
    public ResponseResult querybyId(int id){
        return FormatResponseUtil.formatResponse(areaService.queryAreaById(id));
    }

    @PostMapping
    @ApiOperation(value = "添加",response = ResponseResult.class,notes = "描述接口细节")
    public ResponseResult addArea(@RequestBody Area area){
        System.out.println(area);
        return FormatResponseUtil.formatResponse(areaService.addArea(area));
    }

    @DeleteMapping
    @ApiOperation(value = "删除")
    public ResponseResult delAreaById (int id){
        return FormatResponseUtil.formatResponse(areaService.delAreaById(id));
    }

    @PutMapping
    @ApiOperation(value = "更新")
    public ResponseResult updateArea(@RequestBody Area area){
        return FormatResponseUtil.formatResponse(areaService.updateArea(area));
    }

}
