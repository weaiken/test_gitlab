package com.exam.dao;

import com.exam.entity.Report;
import com.exam.entity.ReportExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReportMapper {
    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExampleWithBLOBs(ReportExample example);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExampleWithBLOBs(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKeyWithBLOBs(Report record);

    int updateByPrimaryKey(Report record);
}