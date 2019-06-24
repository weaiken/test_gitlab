package com.exam.dao;

import com.exam.entity.BankToQUes;
import com.exam.entity.BankToQUesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankToQUesMapper {
    int countByExample(BankToQUesExample example);

    int deleteByExample(BankToQUesExample example);

    int deleteByPrimaryKey(Integer bqid);

    int insert(BankToQUes record);

    int insertSelective(BankToQUes record);

    List<BankToQUes> selectByExample(BankToQUesExample example);

    BankToQUes selectByPrimaryKey(Integer bqid);

    int updateByExampleSelective(@Param("record") BankToQUes record, @Param("example") BankToQUesExample example);

    int updateByExample(@Param("record") BankToQUes record, @Param("example") BankToQUesExample example);

    int updateByPrimaryKeySelective(BankToQUes record);

    int updateByPrimaryKey(BankToQUes record);
}