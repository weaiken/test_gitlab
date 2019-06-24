package com.exam.dao;

import com.exam.entity.QuesSingle;
import com.exam.entity.QuesSingleExample;
import com.exam.entity.QuesSingleWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QuesSingleMapper {
    int countByExample(QuesSingleExample example);

    int deleteByExample(QuesSingleExample example);

    int deleteByPrimaryKey(Integer qsid);

    int insert(QuesSingleWithBLOBs record);

    int insertSelective(QuesSingleWithBLOBs record);

    List<QuesSingleWithBLOBs> selectByExampleWithBLOBs(QuesSingleExample example);

    List<QuesSingle> selectByExample(QuesSingleExample example);

    QuesSingleWithBLOBs selectByPrimaryKey(Integer qsid);

    int updateByExampleSelective(@Param("record") QuesSingleWithBLOBs record, @Param("example") QuesSingleExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesSingleWithBLOBs record, @Param("example") QuesSingleExample example);

    int updateByExample(@Param("record") QuesSingle record, @Param("example") QuesSingleExample example);

    int updateByPrimaryKeySelective(QuesSingleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuesSingleWithBLOBs record);

    int updateByPrimaryKey(QuesSingle record);
}