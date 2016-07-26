package com.wonders.dao;

import com.wonders.model.DicResource;

public interface DicResourceMapper {
    int deleteByPrimaryKey(String resId);

    int insert(DicResource record);

    int insertSelective(DicResource record);

    DicResource selectByPrimaryKey(String resId);

    int updateByPrimaryKeySelective(DicResource record);

    int updateByPrimaryKey(DicResource record);
}