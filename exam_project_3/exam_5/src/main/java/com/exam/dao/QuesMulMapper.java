package com.exam.dao;

import com.exam.entity.QuesMul;
import com.exam.entity.QuesMulExample;
import com.exam.entity.QuesMulWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QuesMulMapper {
    int countByExample(QuesMulExample example);

    int deleteByExample(QuesMulExample example);

    int deleteByPrimaryKey(Integer qmid);

    int insert(QuesMulWithBLOBs record);

    int insertSelective(QuesMulWithBLOBs record);

    List<QuesMulWithBLOBs> selectByExampleWithBLOBs(QuesMulExample example);

    List<QuesMul> selectByExample(QuesMulExample example);

    QuesMulWithBLOBs selectByPrimaryKey(Integer qmid);

    int updateByExampleSelective(@Param("record") QuesMulWithBLOBs record, @Param("example") QuesMulExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesMulWithBLOBs record, @Param("example") QuesMulExample example);

    int updateByExample(@Param("record") QuesMul record, @Param("example") QuesMulExample example);

    int updateByPrimaryKeySelective(QuesMulWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuesMulWithBLOBs record);

    int updateByPrimaryKey(QuesMul record);
}