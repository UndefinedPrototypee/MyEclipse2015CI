package com.webservice.demo;

/**
 * TODO ������ԭʼ����
 * 
 * @author Administrator
 * @since 2015��7��5��18:02:36
 */
public class MyBasicWebServer {

	// ��������Mac��ַ
	public final String serviceMacAddr = "94-DB-C9-B4-39-13";
	// ������������
	public final String serviceName = "liduanfeng";
	// ��������IP��ַ
	public final String serviceIP = "192.168.1.253";

	/**
	 * TODO ���ͻ��˵���
	 * 
	 * @author Administrator
	 * @since 2015��7��5��18:07:15
	 * @return
	 */
	public String getMyServerName() {
		return this.serviceName;
	}

	/**
	 * TODO ���ͻ��˲�ѯ��������IP��ַ
	 * 
	 * @author Administrator
	 * @since 2015��7��5��18:09:50
	 * @return
	 */
	public String getMyServerIP() {
		return this.serviceIP;
	}

	/**
	 * TODO ���ͻ��˲�ѯ��������Mac��ַ
	 * 
	 * @return
	 */
	public String getMyServerMac() {
		return this.serviceMacAddr;
	}

	/**
	 * TODO ���ͻ��˲�ѯ��������Ϣ
	 * 
	 * @author Administrator
	 * @since 2015��7��5��18:11:11
	 * @return
	 */
	public String getMyWebServerMsg() {
		return "������Mac��ַ��" + this.serviceMacAddr + "\t������IP��ַ��" + this.serviceIP + "\t������������:" + this.serviceName;
	}

}
