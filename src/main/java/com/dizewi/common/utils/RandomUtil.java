package com.dizewi.common.utils;

import java.util.HashSet;
import java.util.Random;

/** 
* @author 作者:dizewei
* @version 创建时间：2020年1月5日 下午7:37:43 
* 类功能说明 
*/
public class RandomUtil {
	
	/**
	* @Title: random  
	* @Description: 获取最小值与最大值之间的随机数
	* @param @param min
	* @param @param max
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int randomNumber(int min,int max) {
		Random random = new Random();
		return min+random.nextInt(max-min+1);
	}
	
	/**
	* @Title: random  
	* @Description: 获取可重复的最小值与最大值之间的指定数量的随机数
	* @param @param min
	* @param @param max
	* @param @param num
	* @param @return    参数  
	* @return int[]    返回类型  
	* @throws
	 */
	public static int[] repeatRandomNumber(int min,int max,int num) {
		int[] intArray=new int[num];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=randomNumber(min,max);
		}
		return intArray;
	}
	
	/**
	* @Title: notRepeatRandomNumber  
	* @Description:获取不可重复的最小值与最大值之间的指定数量的随机数
	* @param @param min
	* @param @param max
	* @param @param num
	* @param @return    参数  
	* @return int[]    返回类型  
	* @throws
	 */
	public static int[] notRepeatRandomNumber(int min,int max,int num) {
		int[] intArray=new int[num];
		HashSet<Integer> hashSet = new HashSet<Integer>();
		//当set结合的满足个数时
		while (hashSet.size()!=num) {
			hashSet.add(randomNumber(min,max));
		}
		int i=0;
		//遍历set集合赋值给int数组
		for (Integer integer : hashSet) {
			intArray[i]=integer;
			i++;
		}
		return intArray;
		
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
	* @Description: 获取1-10单个随机数字
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
	* @Description:获取随机的指定长度的1-10单个数字字符串
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
	
	public static void main(String[] args) {
		int randomNumber = randomNumber(3,20);
		String randomLetterString = getRandomLetterString(randomNumber);
		
		
		System.out.println(randomLetterString);
	}
}
