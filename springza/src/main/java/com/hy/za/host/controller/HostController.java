package com.hy.za.host.controller;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hy.za.host.ZabbixBase;
import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.host.HostCreateRequest;
import com.zabbix4j.host.HostCreateResponse;
import com.zabbix4j.host.HostGetRequest;
import com.zabbix4j.host.HostGetResponse;
import com.zabbix4j.host.HostGetResponse.Result;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.hostinteface.HostInterfaceObject;
import com.zabbix4j.usermacro.Macro;
/**
 * @author hy
 * 主机类
 */
@RestController
@RequestMapping("/host/")
public class HostController extends ZabbixBase{

	/**
	 * 展示所有主机方法
	 * @param url
	 * @return
	 * @throws ZabbixApiException
	 */
	@GetMapping("showHostList")
	public ModelAndView showHostList() throws ZabbixApiException{
		//System.out.println("--------------进入主机查询方法--------");
		login(user,password);
		//System.out.println("------登陆成功，查询主机---------------");
		HostGetResponse response =getHost(zabbixApi);
		List<Result> hostlist = response.getResult();
		List<HostObject> hostObject = new ArrayList<HostObject>() ;
		for(int i=0;i<hostlist.size();i++) {
	 		hostObject.add(hostlist.get(i));
			//System.out.println( "主机对象@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+i+"："+hostObject.get(i).toString());       
		}
		
		ModelAndView mav = new ModelAndView("host/hostList","hostlist",hostObject);
		return mav;
	}
	/**
	 * 调用api的host，get方法的封装（获得主机方法）
	 * @throws ZabbixApiException 
	 * */
	public HostGetResponse getHost(ZabbixApi zabbixApi) throws ZabbixApiException{
		//创建请求，接收对象
		HostGetRequest request  = new HostGetRequest();
		//获得返回值
		HostGetResponse response = zabbixApi.host().get(request);
		return response;	
	}
	
	/**
	 * 创建主机方法
	 */
	@RequestMapping(value = "CreatHost", method=RequestMethod.POST)
	public void creatHost(String hostname,Integer groupId,Integer templateId,String hostIP){
		try {
		//建立创建主机的对象
		HostCreateRequest request = new HostCreateRequest();
		HostCreateRequest.Params params = request.getParams();
		//添加模板和组
		params.addTemplateId(templateId);
		params.addGroupId(groupId);
		//添加宏
		List<Macro> macros = new ArrayList<Macro>();
		Macro macro1= new Macro();
		macro1.setMacro("{$MACRO1}");
		macro1.setValue("value1");
		macros.add(macro1);
		//添加主机接口
		HostInterfaceObject hostInterface = new HostInterfaceObject();
		hostInterface.setIp("192.168.0.60");
		params.addHostInterfaceObject(hostInterface);
		//添加主机和主机名
		params.setHost("host192.168.0.60"+new Date().getTime());
		params.setName("name192.168.0.60"+new Date().getTime());
		
		HostCreateResponse response = zabbixApi.host().create(request);
		//assertNotNull(response);
		logger.debug(getGson().toJson(response));
		} catch (ZabbixApiException e) {
			//e.printStackTrace();
		fail(e.getMessage());
		}
	}
}
