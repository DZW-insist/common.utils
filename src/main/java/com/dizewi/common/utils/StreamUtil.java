package com.dizewi.common.utils;
/** 
* @author 作者:dizewei
* @version 创建时间：2020年1月5日 下午7:22:06 
* 类功能说明 
*/
public class StreamUtil {
	
	/**
	* @Title: close  
	* @Description: 批量关闭流  
	* @param @param autoCloseables    参数  
	* @return void    返回类型  
	* @throws
	 */
	public static void close(AutoCloseable...autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
