package com.webservice.demo;

import com.webservice.client.MyServerStart;
import com.webservice.client.MyServerStartService;

/**
 * TODO �ͻ��˷�����
 * @author Administrator
 * @since 2015��7��6��23:31:48
 */
public class MyClientDemo {
	
	public static void main(String[] args) {
		MyServerStart myServerStart = new MyServerStartService().getMyServerStartPort();
		myServerStart.testMyServerStart();
	}
}
