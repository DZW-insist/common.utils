package com.dizewi.common.utils;


/**
 * @author 作者:dizewei
 * @version 创建时间：2020年1月3日 下午3:13:36 类功能说明
 */
public class StringUtil {

	
	/**
	 * 
	* @Title: isNull  
	* @Description: 判断字符串为空，为空时返回true
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isNull(String str) {
		if (str == null) {
			return true;
		}
		//字符串去除空格
		str=str.trim();
		if(str.equals("")) {
			return true;
		}
		return false;
	}
	/**
	 * 
	* @Title: isNotNull  
	* @Description: 判断字符串不为空  
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isNotNull(String str) {
		return !isNull(str);
	}
	
	/**
	 * 
	* @Title: inPhone  
	* @Description: 判断字符串为手机号  
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isPhone(String str) {
		String regex="1[3578]\\d{9}";	
		return str.matches(regex);
	}
	
	/**
	* @Title: isNumber  
	* @Description:判断是否是数字
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isNumber(String str) {
		String regex="[0-9]+";
		return str.matches(regex);
	}
	
	
	
	/**
	* @Title: isEmail  
	* @Description: 判断字符串为邮箱
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isEmail(String str) {
		String regex="\\w+@\\w+(.com|.cn|.com.cn|.net)";	
		return str.matches(regex);
	}
	
	/**
	* @Title: isDate  
	* @Description: 判断是否是时间格式 
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isDate(String str) {
		String regex="\\d{4}-\\d{2}-\\d{2}";	
		return str.matches(regex);
	}
	
	/**
	 * 
	* @Title: isLetter  
	* @Description:判断字符串为字母
	* @param @param str
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isLetter(String str) {
		//字符串不可为空
		if(isNull(str)) {
			return false;
		}
		//将字符串中的字母转为小写字母
		str=str.toLowerCase();
		String regex="[a-z]+";
		return str.matches(regex);
	}
	
	
}
