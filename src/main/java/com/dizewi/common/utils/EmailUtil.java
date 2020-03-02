package com.dizewi.common.utils;
/** 
* @author 作者:dizewei
* @version 创建时间：2020年3月2日 下午3:01:27 
* 类功能说明 
*/
public class EmailUtil {
	
	
	
	
	
	/**
	* @Title: getRandomLetterMail  
	* @Description: 获取指定长度范围的字母邮箱
	* @param @return    参数  
	* @return String    返回类型  
	* @throws
	 */
	public static String getRandomLetterEmail(int min,int max) {
		int randomNumber = RandomUtil.randomNumber(min,max);
		String randomLetterString = RandomUtil.getRandomLetterString(randomNumber);
		
		String[] emails = { "@qq.com", "@163.com", "@sian.com", "@gmail.com", "@sohu.com", "@hotmail.com", "@foxmail.com" };
		
		
		String email = emails[RandomUtil.randomNumber(0, 1)];
		
		
		return randomLetterString+email;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getRandomLetterEmail(3,20));
	}
}
