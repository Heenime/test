/*package com.example.za.creatHost;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;


import com.zabbix4j.host.HostCreateRequest;
import com.zabbix4j.host.HostCreateResponse;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;

//创建主机类
public class TestCreatHost extends ZabbixApiTestBase{
//构造方法
	public TestCreatHost(){
		super();
	} 
	@Test
	public void creatHost(){
		final Integer groupId =4;
		final Integer templateId =10081;
		try{
		HostCreateRequest request = new HostCreateRequest();
		HostCreateRequest.Params params =request.getParams();
		//添加模板和组
		params.addTemplateId(templateId);
		params.addGroupId(groupId);
		//添加宏
		List<Macro> macros = new ArrayList<Macro>();
		Macro macro1 = new Macro();
		macro1.setMacro("{$MACRO1}");
		macro1.setValue("value1"); 
		macros.add(macro1);
		params.setMacros(macros);
		//添加主机接口
		HostInterfaceObject hostInterface = new HostInterfaceObject();
		hostInterface.setIp("192.168.0.60");
		params.addHostInterfaceObject(hostInterface);
		//添加主机和主机名
		params.setHost("test60"+new Date().getTime());
		params.setName("test60name" + new Date().getTime());
		
		HostCreateResponse response = zabbixApi.host().create(request); 
		assertNotNull(response);  
         
		logger.debug(getGson().toJson(response));
		}catch(Exception e){
			fail(e.getMessage());
		}
	}


}*/
