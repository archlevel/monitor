package com.tower.service.monitor.dao.ibatis;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tower.service.dao.ibatis.AbsIntIDIBatisDAOImpl;
import com.tower.service.dao.ibatis.IBatisDAOException;
import com.tower.service.dao.ibatis.IIMapper;
import com.tower.service.dao.ibatis.SqlmapUtils;
import com.tower.service.exception.DataAccessException;
import com.tower.service.monitor.dao.ISoaMonitorDAO;
import com.tower.service.monitor.dao.ibatis.mapper.SoaMonitorMapper;
import com.tower.service.monitor.dao.model.SoaMonitor;

@Repository("SoaMonitor")
public class SoaMonitorIbatisDAOImpl extends AbsIntIDIBatisDAOImpl<SoaMonitor> implements ISoaMonitorDAO<SoaMonitor> {

	@Resource(name = "monitor_db")
	private DataSource masterDataSource;
	
	@Resource(name = "monitor_db_slave")
	private DataSource slaveDataSource;
	
	@Resource(name = "monitor_db_map_query")
	private DataSource mapQueryDataSource;
	
	@Override
	public int getVersion(){
		//代码生成器版本号，请不要手动改
	    return 2;
	}
  
	@Override
	public Class<SoaMonitorMapper> getMapperClass() {
		
		return SoaMonitorMapper.class;
	}
	
	@Override
	public Class<SoaMonitor> getModelClass() {
		
		return SoaMonitor.class;
	}
	
	@Override
	public boolean isFk(String property) {
	
		return SoaMonitor.isFk(property);
	}
	
	public String getTableName() {
    	return "soa_monitor";
  	}
  
	@Override
	public DataSource getMasterDataSource(){
		return masterDataSource;
	}
	
	
	@Override
	public DataSource getSlaveDataSource(){
		if (slaveDataSource == null) {
 			return masterDataSource;
 		}
 		return slaveDataSource;
	}
	
	@Override
	public DataSource getMapQueryDataSource(){
		if (mapQueryDataSource == null) {
 			return getSlaveDataSource();
 		}
 		return mapQueryDataSource;
	}
	
	
	public Integer insert(SoaMonitor model, String tabNameSuffix) {
		if (logger.isDebugEnabled()) {
      		logger.debug("insert(T model={}, String tabNameSuffix={}) - start", model, tabNameSuffix); //$NON-NLS-1$
    	}
    	
    	validate(model);
    	
    	model.setTKjtTabName(this.get$TKjtTabName(tabNameSuffix));
    
    	SqlSession session = SqlmapUtils.openSession(getMasterDataSource());
    	try {
      		IIMapper<SoaMonitor> mapper = session.getMapper(getMapperClass());
      		Long id = mapper.insert(model);
      		if (id !=null) {
        		this.incrTabVersion(tabNameSuffix);
      		}

      		if (logger.isDebugEnabled()) {
        		logger.debug("insert(T model={}, String tabNameSuffix={}) - end - return value={}", model, tabNameSuffix, id); //$NON-NLS-1$
      		}
      		return model.getId();
    	} catch (Exception t) {
      		logger.error("insert(T, String)", t); //$NON-NLS-1$
      		throw new DataAccessException(IBatisDAOException.MSG_2_0001, t);
    	} finally {
     		session.commit();
     		session.close();
    	}
  	}
	
}
