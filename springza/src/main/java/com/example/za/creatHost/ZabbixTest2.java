/*package com.example.za.creatHost;

import java.util.ArrayList;
import java.util.List;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.history.HistoryGetRequest;
import com.zabbix4j.history.HistoryGetResponse;
import com.zabbix4j.history.HistoryObject;


public class ZabbixTest2 {
	  // 这里配置zabbix的url，帐号和密码  
    public static final String ZBX_URL = "http://192.168.0.182/zabbix/api_jsonrpc.php";
    	
    public static final String USERNAME = "Admin";  
    public static final String PASSWORD = "zabbix";  
  
    // 调用api的host get方法的封装  
    public HistoryGetResponse getHostHistory(ZabbixApi zabbixApi) throws ZabbixApiException {  
  
    	HistoryGetRequest request = new HistoryGetRequest();
    	HistoryGetRequest.Params params= request.getParams();
    	
//        "output": "extend",
//        "history": 0,
//        "itemids": "23296",
//        "sortfield": "clock",
//        "sortorder": "DESC",
//        "limit": 10
    	
    	List<Integer> itemids=new ArrayList<Integer>();
    	itemids.add(0,23692);
    	
    	params.setItemids(itemids);
    	params.setOutput("extend");
    	params.setHistory(0);
    	
    	List<String> sortfield=new ArrayList<String>();
    	sortfield.add("clock");
    	params.setSortfield(sortfield);
    	params.setLimit(10);
    	
        System.out.println("parames setting complete..."); 
        System.out.println(request.getJsonrpc());
        
        HistoryGetResponse response = zabbixApi.history().get(request);
  
        return response;  
    }  
  
    public static void main(String[] args) {  
        try {  
            System.out.println("beging...");  
            ZabbixApi zabbixApi = new ZabbixApi(ZBX_URL);  
            zabbixApi.login(USERNAME, PASSWORD);
          
            System.out.println("create new get host instance...");  
            ZabbixTest2 myGetHost = new ZabbixTest2();  
  
            System.out.println("Get host beging...");  
            HistoryGetResponse response = myGetHost.getHostHistory(zabbixApi);  
  
            System.out.println("Get host end...let's print result");  
  
            // 对response进行处理  
            for (int i = 0; i < response.getResult().size(); i++) {  
                //response 返回的信息非常大，可以赋值给HostObject，也可以其他对象  
            	HistoryObject myHostObject = response.getResult().get(i);  
                //打印host信息  
                if (null == myHostObject)  
                    System.out.println("Get host null, program will exit");  
                else {  
                    System.out.println("++++++Print Result " + i + " HostObject+++++++++++");  
                    System.out.println(myHostObject.getItemid());  
                    System.out.println(myHostObject.getClockDate());  
                    System.out.println(myHostObject.getId());  
                    System.out.println(myHostObject.getLogeventid());  
                    System.out.println(myHostObject.getValue());  
                }  
           
                System.out.println("*************************************************");  
            }  
        } catch (ZabbixApiException e) {  
            e.printStackTrace();  
        }  
    }  
}*/