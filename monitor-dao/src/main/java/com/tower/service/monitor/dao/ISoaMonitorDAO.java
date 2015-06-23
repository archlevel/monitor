package com.tower.service.monitor.dao;

import com.tower.service.dao.IDAO;
import com.tower.service.dao.IFKDAO;
import com.tower.service.dao.IIDAO;

import com.tower.service.monitor.dao.model.SoaMonitor;

public interface ISoaMonitorDAO<T extends SoaMonitor> extends IIDAO<T>,IFKDAO<T>,IDAO<T> {

}
