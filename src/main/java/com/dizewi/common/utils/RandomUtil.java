package com.dizewi.common.utils;

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
	public static int random(int min,int max) {
		Random random = new Random();
		return min+random.nextInt(max-min+1);
	}
	/**
	* @Title: random  
	* @Description: 获取最小值与最大值之间的指定数量的随机数
	* @param @param min
	* @param @param max
	* @param @param num
	* @param @return    参数  
	* @return int[]    返回类型  
	* @throws
	 */
	public static int[] random(int min,int max,int num) {
		int[] intArray=new int[num];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=random(min,max);
		}
		
		return intArray;
		
	}
	
}
