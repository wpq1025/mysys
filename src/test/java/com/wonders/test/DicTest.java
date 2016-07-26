package com.wonders.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wonders.model.DicConfig;
import com.wonders.service.DicConfigService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" })  
public class DicTest {

	private static final Logger LOGGER = Logger.getLogger(DicTest.class);  
  
    @Autowired  
    private DicConfigService dicConfigService;
    
    @Test  
    public void testGetDicAll() {  
        List<DicConfig> dics = dicConfigService.getDicConfigs(); 
        LOGGER.info(JSON.toJSON(dics));  
    } 
}
