package com.hy.za.host;


import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;

public class ZabbixBase {
	//配置日志
	protected static Logger logger=LoggerFactory.getLogger(ZabbixBase.class);
	//配置账号密码
	protected static String user ="Admin";
	protected static String password ="zabbix";
	//创建zabbixApi对象
	protected ZabbixApi zabbixApi;
	
	//登录方法
	protected void login(String user,String password) {
		zabbixApi =new ZabbixApi("http://192.168.0.178/zabbix/api_jsonrpc.php");
		try {
			zabbixApi.login(user, password);
		} catch (ZabbixApiException e) {
		e.printStackTrace();
		}
	}
	protected Gson getGson(){
		return new GsonBuilder().setPrettyPrinting().create();
	}
}
