package com.webservice.demo;

/**
 * TODO 服务器原始设置
 * 
 * @author Administrator
 * @since 2015年7月5日18:02:36
 */
public class MyBasicWebServer {

	// 服务器的Mac地址
	public final String serviceMacAddr = "94-DB-C9-B4-39-13";
	// 服务器的名称
	public final String serviceName = "liduanfeng";
	// 服务器的IP地址
	public final String serviceIP = "192.168.1.253";

	/**
	 * TODO 供客户端调用
	 * 
	 * @author Administrator
	 * @since 2015年7月5日18:07:15
	 * @return
	 */
	public String getMyServerName() {
		return this.serviceName;
	}

	/**
	 * TODO 供客户端查询服务器的IP地址
	 * 
	 * @author Administrator
	 * @since 2015年7月5日18:09:50
	 * @return
	 */
	public String getMyServerIP() {
		return this.serviceIP;
	}

	/**
	 * TODO 供客户端查询服务器的Mac地址
	 * 
	 * @return
	 */
	public String getMyServerMac() {
		return this.serviceMacAddr;
	}

	/**
	 * TODO 供客户端查询服务器信息
	 * 
	 * @author Administrator
	 * @since 2015年7月5日18:11:11
	 * @return
	 */
	public String getMyWebServerMsg() {
		return "服务器Mac地址：" + this.serviceMacAddr + "\t服务器IP地址：" + this.serviceIP + "\t服务器的名称:" + this.serviceName;
	}

}
