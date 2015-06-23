package com.tower.service.monitor.dao;

import com.tower.service.dao.generate.tool.DaoGenFromDB;

public class DaoGen {


    public static void main(String[] args) {
        try {
        	/**
        	 * sql server 数据访问层代码生成器
        	 */
        	//DaoGenFromDB.generateSQLSvrDAO("monitor_db", "表名", "classpath*:/META-INF/config/spring/spring-dao.xml", "com.tower.service.monitor", "src/main/java/", "src/main/resources/");
        	/**
        	 * my sql 数据访问层代码生成器
        	 */
            DaoGenFromDB.generateDAO("monitor_db", "soa_monitor", "classpath*:/META-INF/config/spring/spring-dao.xml","com.tower.service.monitor", "src/main/java/", "src/main/resources/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
