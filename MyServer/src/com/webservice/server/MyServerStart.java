package com.webservice.server;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.webservice.demo.MyBasicWebServer;


/**
 * TODO 2、命令提示窗口执行生成命令。
	格式：wsimport -s "src目录" -p “生成类所在包名” -keep “wsdl发布地址”
	wsimport -s "F:\Confidential Document\Workspaces\MyEclipse2015CI\MyClient\src" -p "com.webservice.client" -keep "http://127.0.0.1:12580/WebService/StartMyServer?wsdl"
	示例：
	wsimport -s G:\\workspace\\webService\\TheClient\\src -p com.hyan.client -keep http://localhost:9001/Service/ServiceHello?wsdl
 * @author Administrator
 * @since 2015年6月24日23:23:02
 */
@WebService
public class MyServerStart extends MyBasicWebServer{

	/*
	 * 用于发布的服务器地址，用于客户端进行请求访问
	 * http://127.0.0.1:12580/WebService/StartMyServer
	 * http://127.0.0.1:12580/WebService/StartMyServer?wsdl
	 */
	private final static String clientReqServerURL = "http://127.0.0.1:12580/WebService/StartMyServer";
	//启动时候为本类的类名
	private final static MyServerStart myBasicWebServerStart = new MyServerStart();
	
	/**
	 * TODO 启动方法
	 * @author Administrator 
	 * @since 2015年7月5日18:18:04
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("WebServer服务器启动中...");
		Endpoint.publish(clientReqServerURL, myBasicWebServerStart);
		System.err.println("WebServer服务器启动成功!");
	}
	
	/**
	 * TODO 测试方法
	 * @author Administrator 
	 * @since 2015年7月5日18:20:55
	 */
	public void testMyServerStart(){
		String aString  = "abcd";
		String bString = new String("abcd");
		System.out.println(aString == bString);
		System.out.println(aString.endsWith(bString));
	}
}
