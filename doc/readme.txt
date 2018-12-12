1、启动时报java.lang.ClassNotFoundException: org.apache.catalina.mbeans.ServerLifecycleListener错误
	把server.xml中的<Listener className="org.apache.catalina.mbeans.ServerLifecycleListener" />注释掉
2、安装ActiveMQ
	运行F:\activemq\bin\win64\activemq.bat
	访问：http://localhost:8161/admin/
	admin admin
