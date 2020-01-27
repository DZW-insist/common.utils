package com.dizewi.common.utils;

/**
 * @author 作者:dizewei
 * @version 创建时间：2020年1月27日 上午11:30:07 类功能说明
 */
public class NumberUtil {
	
	/**
	* @Title: getPercent  
	* @Description: 计算当前数百分占比
	* @param @param current
	* @param @param total
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int getPercent(int current,int total) {
		int i=(current*100)/total;
		return i;
	}
}
