package com.mofeisike.springcurddemo.service.impl;

import com.mofeisike.springcurddemo.dao.AreaDao;
import com.mofeisike.springcurddemo.entity.Area;
import com.mofeisike.springcurddemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * description: AreaServiceImpl <br>
 * date: 2020/6/17 13:38 <br>
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    @Override
    public List<Area> queryAll() {
        return areaDao.queryAllArea();
    }

    @Override
    public Area queryAreaById(int id) {
        return areaDao.queryAreaById(id);
    }

    @Override
    public Area updateArea(Area area) {
        if (area.getAreaId() != null && area.getAreaId() > 0) {
            //如果id合法
            if ((area.getAreaName()) != null && !area.getAreaName().trim().equals("") || area.getPriority() != null) {
                //更新的内容不为空
                area.setLastEditTime(new Date());
                int count = areaDao.updateArea(area);
                if (count < 1) {
                    throw new RuntimeException("更新失败");
                }
            } else {
                throw new RuntimeException("更新的内容为空");
            }
        } else {
            throw new RuntimeException("id不合法");
        }
        return areaDao.queryAreaById(area.getAreaId());
    }

    @Override
    public boolean delAreaById(int id) {
        if (areaDao.delAreaById(id) < 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean addArea(Area area) {
        if (area.getAreaName() != null && !area.getAreaName().trim().equals("")) {
            //如果m名字合法
            area.setLastEditTime(new Date());
            area.setCreateTime(new Date());
            int count = areaDao.insertArea(area);
            if (count < 1) {
                throw new RuntimeException("添加失败");
            }
        } else {
            throw new RuntimeException("名字不合法");
        }
        return true;
    }
}
