package com.wonders.dao;

import com.wonders.model.DicVersion;

public interface DicVersionMapper {
    int deleteByPrimaryKey(String id);

    int insert(DicVersion record);

    int insertSelective(DicVersion record);

    DicVersion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DicVersion record);

    int updateByPrimaryKey(DicVersion record);
}