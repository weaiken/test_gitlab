package com.exam.dao;

import com.exam.entity.Paper;
import com.exam.entity.StorePaper;
import com.exam.entity.StorePaperExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorePaperMapper {
    int countByExample(StorePaperExample example);

    int deleteByExample(StorePaperExample example);

    int deleteByPrimaryKey(Integer spid);

    int insert(StorePaper record);

    int insertSelective(StorePaper record);

    List<StorePaper> selectByExample(StorePaperExample example);

    StorePaper selectByPrimaryKey(Integer spid);

    int updateByExampleSelective(@Param("record") StorePaper record, @Param("example") StorePaperExample example);

    int updateByExample(@Param("record") StorePaper record, @Param("example") StorePaperExample example);

    int updateByPrimaryKeySelective(StorePaper record);

    int updateByPrimaryKey(StorePaper record);
    
    List<Paper> selectSharePapers(String keyword);
    
    List<Paper> selectShare(String keyword);
}