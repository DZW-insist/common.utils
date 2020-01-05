package com.dizewi.common.utils;
/** 
* @author 作者:dizewei
* @version 创建时间：2020年1月3日 下午3:13:10 
* 类功能说明 
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static SimpleDateFormat sdfDate=new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat sdfDateTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	
	
	/**
	* @Title: getAge  
	* @Description:    指定时间计算年龄
	* @param @param thisDate
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int getAge(Date thisDate) {
		
		//获取当前日期的年月日 
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		//获取生日的日期的年月日
		calendar.setTime(thisDate);
		int thisyear = calendar.get(Calendar.YEAR);
		int thismonth = calendar.get(Calendar.MONTH);
		int thisday = calendar.get(Calendar.DAY_OF_MONTH);
		
		//年龄
		int age=year-thisyear;
		//判断月份
		if(month<thismonth) {
			age--;
		}
		//判断日期
		if(month==thismonth && day<thisday) {
			age--;
		}
		
		return age;
	}
	
	public static int getAge(String thisDate) {
		Date parse;
		try {
			parse = sdfDate.parse(thisDate);
			return getAge(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * @param date2 
	* @Title: getDayNum  
	* @Description: 求两个时间之间的天数  
	* @param @param date1
	* @param @param date2
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int getDayNum(String date1, String date2) {
		try {
			Date parse1 = sdfDate.parse(date1);
			Date parse2 = sdfDate.parse(date2);
			//一天的毫秒数
			int dateTime=1000*60*60*24;
			long time1 = parse1.getTime();
			long time2 = parse2.getTime();
			//用数学绝对值计算两时间差
			 long abs = Math.abs(time1-time2);
			int i=(int) (abs/dateTime*1);
			return i;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	* @Title: getDayNum  
	* @Description: 计算未来或者过去 离现在的时间 
	* @param @param date1
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int getDayNum(String date1) {
			Date date = new Date();
			String date2 = sdfDate.format(date);
			return getDayNum(date1, date2);
			
	}
	
	public static boolean inWeek(String date) {
		
		return false;
	}
	
	
	public static boolean inMonth(Date thiDate) {
		Calendar instance = Calendar.getInstance();
		return false;
	}
	
	public static boolean inMonth(String thisDate) {
		Date parse;
		try {
			parse = sdfDate.parse(thisDate);
			return inMonth(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
