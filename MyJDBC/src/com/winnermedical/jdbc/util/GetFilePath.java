package com.winnermedical.jdbc.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GetFilePath {

	public static void main(String[] args) {
		GetFilePath getFilePath = new GetFilePath();
		System.out.println("����һ����·����" + getFilePath.getCurrentFilePathOne("/"));
		System.out.println("����һ����·����" + getFilePath.getCurrentFilePathOne());
		System.out.println("����������·����" + getFilePath.getCurrentFilePathTwo());
		System.out.println("����������·����" + getFilePath.getCurrentFilePathThree());
	}

	/**
	 * TODO ��ѯ��ǰ�ļ�·������ һ:��ȡ��ǰ������ڹ���·��; 
	 * @return
	 */
	public String getCurrentFilePathOne(String absolute) {
		File file = new File(this.getClass().getResource("/").getPath()); 
		return file + "";
	}
	
	/**
	 * TODO ��ѯ��ǰ�ļ�·������ һ:��ȡ��ǰ��ľ���·���� 
	 * @return
	 */
	public String getCurrentFilePathOne(){
		File file = new File(this.getClass().getResource("").getPath()); 
		return file + "";
	}
	
	/**
	 * TODO ��ȡ��ǰ������ڹ���·��; 
	 * @return
	 */
	public String getCurrentFilePathTwo(){
		File directory = new File("");//����Ϊ�� 
		String courseFile = "";
		try {
			courseFile = directory.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return courseFile;
	}
	
	/**
	 * TODO ��ȡ��ǰ����srcĿ¼��selected.txt�ļ���·�� 
	 * @return
	 */
	public String getCurrentFilePathThree(){
		URL xmlpath = this.getClass().getClassLoader().getResource("jdbc.properties"); 
		return xmlpath + "";
	}
	/**
	 * ��һ�֣� 
File f = new File(this.getClass().getResource("/").getPath()); 
System.out.println(f); 
���: 
C:\Documents%20and%20Settings\Administrator\workspace\projectName\bin 
��ȡ��ǰ������ڹ���·��; 
������ӡ�/�� 
File f = new File(this.getClass().getResource("").getPath()); 
System.out.println(f); 
����� 
C:\Documents%20and%20Settings\Administrator\workspace\projectName\bin\com\test 
��ȡ��ǰ��ľ���·���� 

�ڶ��֣� 
File directory = new File("");//����Ϊ�� 
String courseFile = directory.getCanonicalPath() ; 
System.out.println(courseFile); 
����� 
C:\Documents and Settings\Administrator\workspace\projectName 
��ȡ��ǰ������ڹ���·��; 

�����֣� 
URL xmlpath = this.getClass().getClassLoader().getResource("selected.txt"); 
System.out.println(xmlpath); 
����� 
file:/C:/Documents%20and%20Settings/Administrator/workspace/projectName/bin/selected.txt 
��ȡ��ǰ����srcĿ¼��selected.txt�ļ���·�� 

�����֣� 
System.out.println(System.getProperty("user.dir")); 
����� 
C:\Documents and Settings\Administrator\workspace\projectName 
��ȡ��ǰ����·�� 

�����֣� 
System.out.println( System.getProperty("java.class.path")); 
����� 
C:\Documents and Settings\Administrator\workspace\projectName\bin 
��ȡ��ǰ����·��
	 */
}
