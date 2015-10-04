package com.winnermedical.jdbc.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GetFilePath {

	public static void main(String[] args) {
		GetFilePath getFilePath = new GetFilePath();
		System.out.println("方法一所得路径：" + getFilePath.getCurrentFilePathOne("/"));
		System.out.println("方法一所得路径：" + getFilePath.getCurrentFilePathOne());
		System.out.println("方法二所得路径：" + getFilePath.getCurrentFilePathTwo());
		System.out.println("方法三所得路径：" + getFilePath.getCurrentFilePathThree());
	}

	/**
	 * TODO 查询当前文件路径方法 一:获取当前类的所在工程路径; 
	 * @return
	 */
	public String getCurrentFilePathOne(String absolute) {
		File file = new File(this.getClass().getResource("/").getPath()); 
		return file + "";
	}
	
	/**
	 * TODO 查询当前文件路径方法 一:获取当前类的绝对路径； 
	 * @return
	 */
	public String getCurrentFilePathOne(){
		File file = new File(this.getClass().getResource("").getPath()); 
		return file + "";
	}
	
	/**
	 * TODO 获取当前类的所在工程路径; 
	 * @return
	 */
	public String getCurrentFilePathTwo(){
		File directory = new File("");//参数为空 
		String courseFile = "";
		try {
			courseFile = directory.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return courseFile;
	}
	
	/**
	 * TODO 获取当前工程src目录下selected.txt文件的路径 
	 * @return
	 */
	public String getCurrentFilePathThree(){
		URL xmlpath = this.getClass().getClassLoader().getResource("jdbc.properties"); 
		return xmlpath + "";
	}
	/**
	 * 第一种： 
File f = new File(this.getClass().getResource("/").getPath()); 
System.out.println(f); 
结果: 
C:\Documents%20and%20Settings\Administrator\workspace\projectName\bin 
获取当前类的所在工程路径; 
如果不加“/” 
File f = new File(this.getClass().getResource("").getPath()); 
System.out.println(f); 
结果： 
C:\Documents%20and%20Settings\Administrator\workspace\projectName\bin\com\test 
获取当前类的绝对路径； 

第二种： 
File directory = new File("");//参数为空 
String courseFile = directory.getCanonicalPath() ; 
System.out.println(courseFile); 
结果： 
C:\Documents and Settings\Administrator\workspace\projectName 
获取当前类的所在工程路径; 

第三种： 
URL xmlpath = this.getClass().getClassLoader().getResource("selected.txt"); 
System.out.println(xmlpath); 
结果： 
file:/C:/Documents%20and%20Settings/Administrator/workspace/projectName/bin/selected.txt 
获取当前工程src目录下selected.txt文件的路径 

第四种： 
System.out.println(System.getProperty("user.dir")); 
结果： 
C:\Documents and Settings\Administrator\workspace\projectName 
获取当前工程路径 

第五种： 
System.out.println( System.getProperty("java.class.path")); 
结果： 
C:\Documents and Settings\Administrator\workspace\projectName\bin 
获取当前工程路径
	 */
}
