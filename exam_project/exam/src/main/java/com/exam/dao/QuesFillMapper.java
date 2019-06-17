package com.exam.dao;

import com.exam.entity.QuesFill;
import com.exam.entity.QuesFillExample;
import com.exam.entity.QuesFillWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QuesFillMapper {
    int countByExample(QuesFillExample example);

    int deleteByExample(QuesFillExample example);

    int deleteByPrimaryKey(Integer qfid);

    int insert(QuesFillWithBLOBs record);

    int insertSelective(QuesFillWithBLOBs record);

    List<QuesFillWithBLOBs> selectByExampleWithBLOBs(QuesFillExample example);

    List<QuesFill> selectByExample(QuesFillExample example);

    QuesFillWithBLOBs selectByPrimaryKey(Integer qfid);

    int updateByExampleSelective(@Param("record") QuesFillWithBLOBs record, @Param("example") QuesFillExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesFillWithBLOBs record, @Param("example") QuesFillExample example);

    int updateByExample(@Param("record") QuesFill record, @Param("example") QuesFillExample example);

    int updateByPrimaryKeySelective(QuesFillWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuesFillWithBLOBs record);

    int updateByPrimaryKey(QuesFill record);
}