package com.wonders.dao;

import java.util.List;

import com.wonders.model.DicConfig;

public interface DicConfigMapper {
    int deleteByPrimaryKey(String dicId);

    int insert(DicConfig record);

    int insertSelective(DicConfig record);

    DicConfig selectByPrimaryKey(String dicId);

    int updateByPrimaryKeySelective(DicConfig record);

    int updateByPrimaryKey(DicConfig record);
    
    List<DicConfig> getAll();
}