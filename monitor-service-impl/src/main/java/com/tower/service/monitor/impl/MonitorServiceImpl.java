package com.tower.service.monitor.impl;

import javax.annotation.Resource;

import com.alibaba.dubbo.common.URL;
import com.tower.service.log.Logger;
import com.tower.service.log.LoggerFactory;
import com.tower.service.monitor.IMonitorService;
import com.tower.service.monitor.dao.ISoaMonitorDAO;
import com.tower.service.monitor.dao.model.SoaMonitor;

public class MonitorServiceImpl implements IMonitorService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name="SoaMonitor")
	private ISoaMonitorDAO<SoaMonitor> soaMonitor;
	
	@Override
	public void publish(URL url) {
		logger.info(url.toFullString());
	}

}
