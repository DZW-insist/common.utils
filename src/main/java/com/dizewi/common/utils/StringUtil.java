package com.dizewi.common.utils;

import java.util.Random;

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
	
	public static boolean isNumber(String str) {
		String regex="\\d+";
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
	
	/**
	* @Title: getRandomChar  
	* @Description: 获取随机的英文字母
	* @param @return    参数  
	* @return char    返回类型  
	* @throws
	 */
	public static char getRandomLetterChar() {
		Random random = new Random();
		char c=(char) ('a'+random.nextInt(26));
		return c;
	}
	
	/**
	* @Title: getRandomString  
	* @Description: 获取随机的指定长度的英文字符串
	* @param @param i
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String getRandomLetterString(int num) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num; i++) {
			sb.append(getRandomLetterChar());
		}
		return sb.toString();
	}
	
	/**
	* @Title: getRandomNumber  
	* @Description: 获取随机数字
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static char getRandomNumber() {
		Random random = new Random();
		char c=(char) ('0'+random.nextInt(10));
		return c;
	}
	
	/**
	* @Title: getRandomNumberString  
	* @Description:获取随机的指定长度的数字字符串
	* @param @param num
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String getRandomNumberString(int num) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <num; i++) {
			sb.append(getRandomNumber());
		}
		return sb.toString();
	}
	
	
	/**
	* @Title: getRandomNumAndChar  
	* @Description: 获取随机的指定长度的数字字母字符串
	* @param @param Num
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String getRandomNumAndChar(int num) {
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			int j=random.nextInt(36);
			//随机数字大于10生成字母
			if (j>10) {
			sb.append(getRandomLetterChar());
			}else{
				sb.append(getRandomNumber());
			}
		}
		return sb.toString();
	}

}
