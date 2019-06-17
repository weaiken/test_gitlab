package com.exam.dao;

import com.exam.entity.ExamineeAns;
import com.exam.entity.ExamineeAnsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExamineeAnsMapper {
    int countByExample(ExamineeAnsExample example);

    int deleteByExample(ExamineeAnsExample example);

    int deleteByPrimaryKey(Integer eaid);

    int insert(ExamineeAns record);

    int insertSelective(ExamineeAns record);

    List<ExamineeAns> selectByExampleWithBLOBs(ExamineeAnsExample example);

    List<ExamineeAns> selectByExample(ExamineeAnsExample example);

    ExamineeAns selectByPrimaryKey(Integer eaid);

    int updateByExampleSelective(@Param("record") ExamineeAns record, @Param("example") ExamineeAnsExample example);

    int updateByExampleWithBLOBs(@Param("record") ExamineeAns record, @Param("example") ExamineeAnsExample example);

    int updateByExample(@Param("record") ExamineeAns record, @Param("example") ExamineeAnsExample example);

    int updateByPrimaryKeySelective(ExamineeAns record);

    int updateByPrimaryKeyWithBLOBs(ExamineeAns record);

    int updateByPrimaryKey(ExamineeAns record);
}