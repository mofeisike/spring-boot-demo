package com.mofeisike.springcurddemo.dao;

import com.mofeisike.springcurddemo.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: AreaDao <br>
 * date: 2020/6/17 13:43 <br>
 */
@Repository
//@Mapper
// 可以通过这种标记这是一个mybatis的文件，也可以在主程序扫描全局文件
public interface AreaDao {

    //查询所以区域
    List<Area> queryAllArea();

    //通过id查询对应的唯一的area
    Area queryAreaById(@Param("id") int id);

    //添加area
    int insertArea(@Param("area") Area area);

    //更新area信息
    int updateArea(@Param("area") Area area);

    //通过id来删除对应的Area
    int delAreaById(@Param("id") int id);

}
