package com.mofeisike.springcurddemo.service;

import com.mofeisike.springcurddemo.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: AreaService <br>
 * date: 2020/6/17 13:38 <br>
 */

public interface AreaService {

    //通过id查询Area
    List<Area> queryAll();

    //通过id查询对应Area数据
    Area queryAreaById(int id);

    //更新Area数据
    Area updateArea(Area area);

    //删除对应id的Area的数据
    boolean delAreaById(int id);

    //添加Area数据
    boolean addArea(Area area);

}
