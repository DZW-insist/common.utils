package com.dizewi.common.utils;

import java.security.MessageDigest;

/**
 * @author 作者:dizewei
 * @version 创建时间：2020年1月12日 上午9:29:52 类功能说明
 */
public class Md5Util {

	/**
	* @Title: stringMd5  
	* @Description: md5加码 生成32位MD5码
	* @param @param inStr
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String stringMd5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("Md5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}
		byte[] md5Byte = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Byte.length; i++) {
			int val = ((int) md5Byte[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	
	/**
	* @Title: converMd5  
	* @Description: 加密解密算法执行一次加密，两次解密  
	* @param @param inStr
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String converMd5(String inStr) {
		char[] charArray = inStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] ^ '9');
		}
		String string = new String(charArray);
		return string;
	}

}
