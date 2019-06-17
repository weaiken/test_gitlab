package com.exam.dao;

import com.exam.entity.RecordSell;
import com.exam.entity.RecordSellExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecordSellMapper {
    int countByExample(RecordSellExample example);

    int deleteByExample(RecordSellExample example);

    int deleteByPrimaryKey(Integer rsid);

    int insert(RecordSell record);

    int insertSelective(RecordSell record);

    List<RecordSell> selectByExample(RecordSellExample example);

    RecordSell selectByPrimaryKey(Integer rsid);

    int updateByExampleSelective(@Param("record") RecordSell record, @Param("example") RecordSellExample example);

    int updateByExample(@Param("record") RecordSell record, @Param("example") RecordSellExample example);

    int updateByPrimaryKeySelective(RecordSell record);

    int updateByPrimaryKey(RecordSell record);
}