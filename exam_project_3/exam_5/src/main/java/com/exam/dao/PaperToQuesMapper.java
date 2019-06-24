package com.exam.dao;

import com.exam.entity.PaperToQues;
import com.exam.entity.PaperToQuesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaperToQuesMapper {
    int countByExample(PaperToQuesExample example);

    int deleteByExample(PaperToQuesExample example);

    int deleteByPrimaryKey(Integer pqid);

    int insert(PaperToQues record);

    int insertSelective(PaperToQues record);

    List<PaperToQues> selectByExample(PaperToQuesExample example);

    PaperToQues selectByPrimaryKey(Integer pqid);

    int updateByExampleSelective(@Param("record") PaperToQues record, @Param("example") PaperToQuesExample example);

    int updateByExample(@Param("record") PaperToQues record, @Param("example") PaperToQuesExample example);

    int updateByPrimaryKeySelective(PaperToQues record);

    int updateByPrimaryKey(PaperToQues record);
}