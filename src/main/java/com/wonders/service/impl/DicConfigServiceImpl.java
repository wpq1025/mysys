package com.wonders.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonders.dao.DicConfigMapper;
import com.wonders.model.DicConfig;
import com.wonders.service.DicConfigService;

@Service("dicConfigService")  
public class DicConfigServiceImpl implements DicConfigService {
	
	@Autowired
	private DicConfigMapper dicConfigMapper;

	@Override
	public List<DicConfig> getDicConfigs() {
		// TODO Auto-generated method stub
		return dicConfigMapper.getAll();
	}

	@Override
	public DicConfig selectById(String dicId) {
		// TODO Auto-generated method stub
		return dicConfigMapper.selectByPrimaryKey(dicId);
	}

}
