/*package com.example.za.creatHost;

import static org.junit.Assert.fail;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;

public class ZabbixApiTestBase {
	//protected static Logger logger= LoggerFactory.getLogger(ZabbixApiTestBase.class);
	protected static String user ="Admin";
	protected static String password ="zabbix";
	
	protected ZabbixApi zabbixApi;
	
	public ZabbixApiTestBase(){
		login(user,password);
	}
    protected void login(String user,String password){
    	try{
    		zabbixApi = new ZabbixApi("http://192.168.130.143/zabbix/api_jsonrpc.php");
    		zabbixApi.login(user,password);
    		
    	}catch(ZabbixApiException e){
    		fail(e.getMessage());
    	}
    }
    
	protected Gson getGson(){
    	return new GsonBuilder().setPrettyPrinting().create();
    }

	
}
*/