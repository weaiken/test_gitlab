package com.exam.dao;

import com.exam.entity.Examinee;
import com.exam.entity.ExamineeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExamineeMapper {
    int countByExample(ExamineeExample example);

    int deleteByExample(ExamineeExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    List<Examinee> selectByExample(ExamineeExample example);

    Examinee selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Examinee record, @Param("example") ExamineeExample example);

    int updateByExample(@Param("record") Examinee record, @Param("example") ExamineeExample example);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);
}