package com.exam.dao;

import com.exam.entity.RecordBuy;
import com.exam.entity.RecordBuyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecordBuyMapper {
    int countByExample(RecordBuyExample example);

    int deleteByExample(RecordBuyExample example);

    int deleteByPrimaryKey(Integer rbid);

    int insert(RecordBuy record);

    int insertSelective(RecordBuy record);

    List<RecordBuy> selectByExample(RecordBuyExample example);

    RecordBuy selectByPrimaryKey(Integer rbid);

    int updateByExampleSelective(@Param("record") RecordBuy record, @Param("example") RecordBuyExample example);

    int updateByExample(@Param("record") RecordBuy record, @Param("example") RecordBuyExample example);

    int updateByPrimaryKeySelective(RecordBuy record);

    int updateByPrimaryKey(RecordBuy record);
}