package com.wonders.service;

import java.util.List;

import com.wonders.model.DicConfig;

public interface DicConfigService {
	
	List<DicConfig> getDicConfigs();
	
	DicConfig selectById(String dicId);

}
