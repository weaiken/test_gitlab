package com.exam.dao;

import com.exam.entity.QuesShort;
import com.exam.entity.QuesShortExample;
import com.exam.entity.QuesShortWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QuesShortMapper {
    int countByExample(QuesShortExample example);

    int deleteByExample(QuesShortExample example);

    int deleteByPrimaryKey(Integer qsid);

    int insert(QuesShortWithBLOBs record);

    int insertSelective(QuesShortWithBLOBs record);

    List<QuesShortWithBLOBs> selectByExampleWithBLOBs(QuesShortExample example);

    List<QuesShort> selectByExample(QuesShortExample example);

    QuesShortWithBLOBs selectByPrimaryKey(Integer qsid);

    int updateByExampleSelective(@Param("record") QuesShortWithBLOBs record, @Param("example") QuesShortExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesShortWithBLOBs record, @Param("example") QuesShortExample example);

    int updateByExample(@Param("record") QuesShort record, @Param("example") QuesShortExample example);

    int updateByPrimaryKeySelective(QuesShortWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuesShortWithBLOBs record);

    int updateByPrimaryKey(QuesShort record);
}