### 部署规范


+ 部署用户

	+ deployer
	
+ 部署应用程序目录结构

	+ ~/apps
	
			|
			start.sh service version
		 	order
		 	merchant
		 	monitor
		 	  |
		 	  current
		 	  v1
		 	  v2
		 	  v3
		 	  ...
		 	  vn
		 	  	|
		 	  	pom.xml
		 	  	monitor-cache
		 	  	monitor-common
		 	  	monitor-config
		 	  	monitor-dao
		 	  	monitor-domain
		 	  	monitor-job
		 	  		|
		 	  		start.sh
		 	  	monitor-mq
		 	  	monitor-rpc
		 	  	monitor-service
		 	  	monitor-service-impl
		 	  		|
		 	  		start.sh
		 	  	monitor-web
		 	  		|
		 	  		start.sh
		 	  		pom.xml
		 	  		target
		 	  			|
		 	  			monitor-web.war
		 	  			或者
		 	  			monitor-web
	+ 日志目录结构
		+ /data1/logs/service/monitor/
		
								|
								dlog.log
								elog.log
								request.log
	＋ 全局配置文件目录
		+ /config
