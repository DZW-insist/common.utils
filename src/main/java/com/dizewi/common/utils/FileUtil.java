package com.dizewi.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/** 
* @author 作者:dizewei
* @version 创建时间：2020年1月4日 上午8:39:05 
* 类功能说明 
*/
public class FileUtil {
	
	/**
	* @Title: getExtName  
	* @Description: 获取文件的拓展名
	* @param @param fileName
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String getExtName(String fileName) {
		fileName=fileName.trim();
		if(fileName==null ||fileName.equals("")) {
			throw new RuntimeException("文件名不可为空");
		}
		if(fileName.lastIndexOf(".")<=-1) {
			throw new RuntimeException(fileName+":该文件 没有包含拓展名");
		}
		String extName = fileName.substring(fileName.lastIndexOf("."));
		
		return extName;
	}
		
	/**
	* @Title: getTempDirectory  
	* @Description: 获取操作系统的临时目录
	* @param @return    参数  
	* @return File    返回类型  
	* @throws
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
		
	}
	
	/**
	* @Title: getUserDirectory  
	* @Description: 获取用户目录 
	* @param @return    参数  
	* @return File    返回类型  
	* @throws
	 */
	public static File getUserDirectory() {
		String path = System.getProperty("user.home");
		return new File(path);
	}
	
	
	public static void deleFile(String fileName) {
		deleteFile(new File(fileName));
	}
	/**
	* @Title: deleteFile  
	* @Description: 删除文件
	* @param @param file    参数  
	* @return void    返回类型  
	* @throws
	 */
	public static void deleteFile(File file) {
		File[] listFile=file.listFiles();
		for (File thisFile : listFile) {
			//判断该文件是否是目录还是文件
			if(thisFile.isDirectory()) {
				//迭代调用方法进行删除
				deleteFile(thisFile);
				//删除文件夹
				thisFile.delete();
			}else {
				//是文件的话删除文件
				thisFile.delete();
			}
		}
	}
	
	/**
	* @Title: readFile  
	* @Description: 读取文件  
	* @param @param fileName
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String  readFile(File fileName) {
		//缓冲字符串
		StringBuffer sb = new StringBuffer();
		//缓冲输入流
		BufferedReader br=null;
		try {
			//字符输入流转缓冲输入流
			br=new BufferedReader(new FileReader(fileName));
			do {
				//读取一行
				String readLine = br.readLine();
				//追加至缓冲字符串
				sb.append(readLine);
				//读取一行进行换行
				sb.append("\n");
			} while (br.read()!=-1);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			StreamUtil.close(br);
		}
		return sb.toString();
		
	}
	
	/**
	* @Title: readFileToList  
	* @Description: 读取文件至list集合
	* @param @param fileName
	* @param @return    参数  
	* @return List<String>    返回类型  
	* @throws
	 */
	public static List<String>  readFileToList(File fileName) {
		List<String> list = new ArrayList<String>();
		//缓冲输入流
		BufferedReader br=null;
		try {
			//字符输入流转缓冲输入流
			br=new BufferedReader(new FileReader(fileName));
			do {
				//读取一行
				String readLine = br.readLine();
				//追加至缓冲字符串
				list.add(readLine);
				//读取一行进行换行
			} while (br.read()!=-1);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			StreamUtil.close(br);
		}
		return list;
		
	}
	
}
