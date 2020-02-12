package com.dizewi.common.utils;

import java.util.Collection;

/** 
* @author 作者:dizewei
* @version 创建时间：2020年2月11日 上午8:48:58 
* 类功能说明 
*/
public class CollectionUtil {
	
	/**
	* @Title: 判断集合是否为空  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param collection
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.size()!=0;
	}
	

}
