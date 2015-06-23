package com.tower.service.monitor.dao.model;

import java.util.HashMap;
import java.util.Map;

import com.tower.service.annotation.JField;
import com.tower.service.dao.IModel;

public class SoaMonitor implements IModel{
	
	private static final long serialVersionUID = 1L;
	
	static Map<String,Integer> fks = new HashMap<String,Integer>();
	
	static{
		/**
		 * 把该model相关的外键属性字段注册到fks map中
		 */
		//eg:fks.put("cityId",0);
	}
	/**
	 * 是否是外键字段
     */
    public static boolean isFk(String name){
    	return fks.containsKey(name);
    }

	/**
	 * 纪录id
	 */
	@JField(name="id")
 	protected Integer id;
 	
  	public void setId(Integer id){
  		this.id=id;
  	}
  	
  	public Integer getId(){
  		return this.id;
  	}
	/**
	 * 
	 */
	@JField(name="ip")
  	private String ip;
  	
  	public void setIp(String ip){
  		this.ip=ip;
  	}
  	
  	public String getIp(){
  		return this.ip;
  	}
	/**
	 * 
	 */
	@JField(name="pid")
  	private Integer pid;
  	
  	public void setPid(Integer pid){
  		this.pid=pid;
  	}
  	
  	public Integer getPid(){
  		return this.pid;
  	}
	/**
	 * 
	 */
	@JField(name="applications")
  	private String applications;
  	
  	public void setApplications(String applications){
  		this.applications=applications;
  	}
  	
  	public String getApplications(){
  		return this.applications;
  	}
	/**
	 * 
	 */
	@JField(name="protocols")
  	private String protocols;
  	
  	public void setProtocols(String protocols){
  		this.protocols=protocols;
  	}
  	
  	public String getProtocols(){
  		return this.protocols;
  	}
	/**
	 * 
	 */
	@JField(name="interfaces")
  	private String interfaces;
  	
  	public void setInterfaces(String interfaces){
  		this.interfaces=interfaces;
  	}
  	
  	public String getInterfaces(){
  		return this.interfaces;
  	}
	/**
	 * 
	 */
	@JField(name="methods")
  	private String methods;
  	
  	public void setMethods(String methods){
  		this.methods=methods;
  	}
  	
  	public String getMethods(){
  		return this.methods;
  	}
	/**
	 * 
	 */
	@JField(name="params")
  	private String params;
  	
  	public void setParams(String params){
  		this.params=params;
  	}
  	
  	public String getParams(){
  		return this.params;
  	}
	/**
	 * 心跳数量
	 */
	@JField(name="heartbeats")
  	private Integer heartbeats;
  	
  	public void setHeartbeats(Integer heartbeats){
  		this.heartbeats=heartbeats;
  	}
  	
  	public Integer getHeartbeats(){
  		return this.heartbeats;
  	}
	/**
	 * 请求数量
	 */
	@JField(name="requests")
  	private Integer requests;
  	
  	public void setRequests(Integer requests){
  		this.requests=requests;
  	}
  	
  	public Integer getRequests(){
  		return this.requests;
  	}
	/**
	 * 性能每分钟90%的毫秒数量
	 */
	@JField(name="performances")
  	private Integer performances;
  	
  	public void setPerformances(Integer performances){
  		this.performances=performances;
  	}
  	
  	public Integer getPerformances(){
  		return this.performances;
  	}
	/**
	 * yyyyMMddhhmm
	 */
	@JField(name="updatetime")
  	private Integer updatetime;
  	
  	public void setUpdatetime(Integer updatetime){
  		this.updatetime=updatetime;
  	}
  	
  	public Integer getUpdatetime(){
  		return this.updatetime;
  	}
	
    
	/**
	 * 保存时非空数据项校验；
	 */
	public boolean validate(){
		boolean passed = true;
		return passed;
	}
	
	/**
   	* 保存时对应的分表；
   	*/
  	private String tKjtTabName;

  	public String getTKjtTabName() {
    	return tKjtTabName;
  	}

  	@Override
  	public void setTKjtTabName(String tKjtTabName) {
    	this.tKjtTabName = tKjtTabName;
  	}
}
