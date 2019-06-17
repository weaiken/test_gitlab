package com.exam.dao;

import com.exam.entity.QuesBank;
import com.exam.entity.QuesBankExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QuesBankMapper {
    int countByExample(QuesBankExample example);

    int deleteByExample(QuesBankExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(QuesBank record);

    int insertSelective(QuesBank record);

    List<QuesBank> selectByExampleWithBLOBs(QuesBankExample example);

    List<QuesBank> selectByExample(QuesBankExample example);

    QuesBank selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") QuesBank record, @Param("example") QuesBankExample example);

    int updateByExampleWithBLOBs(@Param("record") QuesBank record, @Param("example") QuesBankExample example);

    int updateByExample(@Param("record") QuesBank record, @Param("example") QuesBankExample example);

    int updateByPrimaryKeySelective(QuesBank record);

    int updateByPrimaryKeyWithBLOBs(QuesBank record);

    int updateByPrimaryKey(QuesBank record);
}