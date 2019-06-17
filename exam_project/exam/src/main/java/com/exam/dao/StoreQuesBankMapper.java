package com.exam.dao;

import com.exam.entity.StoreQuesBank;
import com.exam.entity.StoreQuesBankExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StoreQuesBankMapper {
    int countByExample(StoreQuesBankExample example);

    int deleteByExample(StoreQuesBankExample example);

    int deleteByPrimaryKey(Integer sbid);

    int insert(StoreQuesBank record);

    int insertSelective(StoreQuesBank record);

    List<StoreQuesBank> selectByExample(StoreQuesBankExample example);

    StoreQuesBank selectByPrimaryKey(Integer sbid);

    int updateByExampleSelective(@Param("record") StoreQuesBank record, @Param("example") StoreQuesBankExample example);

    int updateByExample(@Param("record") StoreQuesBank record, @Param("example") StoreQuesBankExample example);

    int updateByPrimaryKeySelective(StoreQuesBank record);

    int updateByPrimaryKey(StoreQuesBank record);
}