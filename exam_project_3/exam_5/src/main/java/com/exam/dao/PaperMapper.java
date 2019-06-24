package com.exam.dao;

import com.exam.entity.Paper;
import com.exam.entity.PaperExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaperMapper {
    int countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExampleWithBLOBs(PaperExample example);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExampleWithBLOBs(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKeyWithBLOBs(Paper record);

    int updateByPrimaryKey(Paper record);
    
    // 魏:
    // 查找教师的所有试卷
    List<Paper> selectTeaPapers(Integer uid);
    
    // 获取试卷的考生数
    int countExamineeNum(Integer pid);
    
    // 获取试卷的成绩报告书
    int countReportNum(Integer pid);
    
    // 插入一条没有主键的paper记录
    int insertPaperNoPrimaryKey(Paper p);
}