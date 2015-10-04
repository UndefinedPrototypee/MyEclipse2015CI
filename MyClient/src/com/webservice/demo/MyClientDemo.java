package com.webservice.demo;

import com.webservice.client.MyServerStart;
import com.webservice.client.MyServerStartService;

/**
 * TODO 客户端服务类
 * @author Administrator
 * @since 2015年7月6日23:31:48
 */
public class MyClientDemo {
	
	public static void main(String[] args) {
		MyServerStart myServerStart = new MyServerStartService().getMyServerStartPort();
		myServerStart.testMyServerStart();
	}
}
