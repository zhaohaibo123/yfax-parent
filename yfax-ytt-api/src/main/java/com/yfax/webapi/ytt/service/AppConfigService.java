package com.yfax.webapi.ytt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yfax.webapi.ytt.dao.AppConfigDao;
import com.yfax.webapi.ytt.vo.AppConfigVo;

/**
 * 信息配置数据
 * @author Minbo
 */
@Service
public class AppConfigService{
	
	protected static Logger logger = LoggerFactory.getLogger(AppConfigService.class);
	
	@Autowired
	private AppConfigDao dao;
	
	public AppConfigVo selectAppConfig() {
		return this.dao.selectAppConfig();
	}

}
