package com.webservice.server;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.webservice.demo.MyBasicWebServer;


/**
 * TODO 2��������ʾ����ִ���������
	��ʽ��wsimport -s "srcĿ¼" -p �����������ڰ����� -keep ��wsdl������ַ��
	wsimport -s "F:\Confidential Document\Workspaces\MyEclipse2015CI\MyClient\src" -p "com.webservice.client" -keep "http://127.0.0.1:12580/WebService/StartMyServer?wsdl"
	ʾ����
	wsimport -s G:\\workspace\\webService\\TheClient\\src -p com.hyan.client -keep http://localhost:9001/Service/ServiceHello?wsdl
 * @author Administrator
 * @since 2015��6��24��23:23:02
 */
@WebService
public class MyServerStart extends MyBasicWebServer{

	/*
	 * ���ڷ����ķ�������ַ�����ڿͻ��˽����������
	 * http://127.0.0.1:12580/WebService/StartMyServer
	 * http://127.0.0.1:12580/WebService/StartMyServer?wsdl
	 */
	private final static String clientReqServerURL = "http://127.0.0.1:12580/WebService/StartMyServer";
	//����ʱ��Ϊ���������
	private final static MyServerStart myBasicWebServerStart = new MyServerStart();
	
	/**
	 * TODO ��������
	 * @author Administrator 
	 * @since 2015��7��5��18:18:04
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("WebServer������������...");
		Endpoint.publish(clientReqServerURL, myBasicWebServerStart);
		System.err.println("WebServer�����������ɹ�!");
	}
	
	/**
	 * TODO ���Է���
	 * @author Administrator 
	 * @since 2015��7��5��18:20:55
	 */
	public void testMyServerStart(){
		String aString  = "abcd";
		String bString = new String("abcd");
		System.out.println(aString == bString);
		System.out.println(aString.endsWith(bString));
	}
}
