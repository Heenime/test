/*package com.example.za.creatHost;

import java.util.List;

import com.zabbix4j.ZabbixApi;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.host.HostGetRequest;
import com.zabbix4j.host.HostGetResponse;
import com.zabbix4j.host.HostObject;
import com.zabbix4j.item.ItemObject;

public class ZabbixTest {
	  // 这里配置zabbix的url，帐号和密码  
    public static final String ZBX_URL = "http://192.168.0.182/zabbix/api_jsonrpc.php";
    public static final String USERNAME = "Admin";  
    public static final String PASSWORD = "zabbix";  
  
    // 调用api的host get方法的封装  
    public HostGetResponse getHost(ZabbixApi zabbixApi) throws ZabbixApiException {  
  
        HostGetRequest request = new HostGetRequest();  
        HostGetRequest.Params params = request.getParams();  
  
        // 这里可以设指定的id值，也可以不设值。设值的话，取指定的内容，不设的话，获取全部的host  
        params.setHostids(null);  
  
        System.out.println("parames setting complete...");  
        HostGetResponse response = zabbixApi.host().get(request);  
  
        return response;  
    }  
  
    public static void main(String[] args) {  
        try {  
            System.out.println("beging...");  
            ZabbixApi zabbixApi = new ZabbixApi(ZBX_URL);  
            zabbixApi.login(USERNAME, PASSWORD);
            //HistoryGetRequest request = new HistoryRequest()
            //zabbixApi.history().get(HistoryGetRequest request);
            //get(HistoryRequest request);
            System.out.println("create new get host instance...");  
            ZabbixTest myGetHost = new ZabbixTest();  
  
            System.out.println("Get host beging...");  
            HostGetResponse response = myGetHost.getHost(zabbixApi);  
  
            System.out.println("Get host end...let's print result");  
  
            // 对response进行处理  
            for (int i = 0; i < response.getResult().size(); i++) {  
               //response 返回的信息非常大，可以赋值给HostObject，也可以其他对象  
                HostObject myHostObject = response.getResult().get(i);  
                //response 返回的信息非常大，可以赋值给ItemObject，也可以其他对象  
                List<ItemObject> myItemObjectList = response.getResult().get(i).getItems();  
                //打印host信息  
                if (null == myHostObject)  
                    System.out.println("没有得到host");  
                else {  
                    System.out.println("++++++打印结果： " + i + " HostObject+++++++++++");  
                    System.out.println("主机："+myHostObject.getHost());  
                    System.out.println("主机名："+myHostObject.getName());  
                    System.out.println("返回值："+myHostObject.getAvailable());  
                    System.out.println("主机ID："+myHostObject.getHostid());  
                    System.out.println("主机状态："+myHostObject.getStatus());  
                }  
                //打印这个host下的item信息  
                if(myItemObjectList!=null){
                for (int j = 0; j < myItemObjectList.size(); j++) {  
                    if (j == 0)  
                        System.out.println("++++++Print ItemObject List " + "+++++++++++");  
                    ItemObject tmpItemObject = myItemObjectList.get(j);  
                    System.out.println("Itemid:" + tmpItemObject.getItemid());  
                    System.out.println("Templateid:"  
                            + tmpItemObject.getTemplateid());  
                    System.out.println("Hostid:" + tmpItemObject.getHostid());  
                    System.out.println("Name:" + tmpItemObject.getName());  
                    System.out.println("Key:" + tmpItemObject.getKey_());  
                    System.out.println("Lastvalue:" + tmpItemObject.getLastvalue());  
                    System.out.println("Lastclock:" + tmpItemObject.getLastclock());  
                    System.out .println("------------------------------------------");  
                } 
                }
                System.out.println("*****************%%%%%%%%%%%%%%************");  
            }  
        } catch (ZabbixApiException e) {  
            e.printStackTrace();  
        }  
    }  
}
*/