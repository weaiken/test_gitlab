package com.exam.dao;

import com.exam.entity.QuesJudge;
import com.exam.entity.QuesJudgeExample;
import com.exam.entity.QuesJudgeWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QuesJudgeMapper {
    int countByExample(QuesJudgeExample example);

    int deleteByExample(QuesJudgeExample example);

    int deleteByPrimaryKey(Integer qjid);

    int insert(QuesJudgeWithBLOBs record);

    int insertSelective(QuesJudgeWithBLOBs record);

    List<QuesJudgeWithBLOBs> selectByExampleWithBLOBs(QuesJudgeExample example);

    List<QuesJudge> selectByExample(QuesJudgeExample example);

    QuesJudgeWithBLOBs selectByPrimaryKey(Integer qjid);

    int updateByExampleSelective(@Param("record") QuesJudgeWithBLOBs record, @Param("example") QuesJudgeExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesJudgeWithBLOBs record, @Param("example") QuesJudgeExample example);

    int updateByExample(@Param("record") QuesJudge record, @Param("example") QuesJudgeExample example);

    int updateByPrimaryKeySelective(QuesJudgeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuesJudgeWithBLOBs record);

    int updateByPrimaryKey(QuesJudge record);
}