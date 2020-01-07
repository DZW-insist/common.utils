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
	* @Description:  根据指定时间计算年龄
	* @param @param thisDate
	* @param @return    参数  
	* @return int    返回类型  
	* @throws
	 */
	public static int getAge(Date thisDate) {
		//获取日历插件
		Calendar calendar = Calendar.getInstance();
		//获取当前年
		int year = calendar.get(Calendar.YEAR);
		//获取当前月
		int month = calendar.get(Calendar.MONTH);
		//获取当前日
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		//将日历时间设置为给定的生日时间
		calendar.setTime(thisDate);
		int thisyear = calendar.get(Calendar.YEAR);
		int thismonth = calendar.get(Calendar.MONTH);
		int thisday = calendar.get(Calendar.DAY_OF_MONTH);
		
		//计算年龄
		int age=year-thisyear;
		//判断月份，当前月份小于生日月份，年龄减1
		if(month<thismonth) {
			age--;
		}
		//当前月份等于生日月份，判断日期，日期小于生日日期，年龄减1
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
	public static int getDayNum(Date date1, Date date2) {
			//一天的毫秒数
			int dateTime=1000*60*60*24;
			long time1 = date1.getTime();
			long time2 = date2.getTime();
			//用数学绝对值计算两时间差
			 long abs = Math.abs(time1-time2);
			int i=(int) (abs/dateTime*1);
			return i;
	}
	public static int getDayNum(String date1, String date2) {
		Date parse1;
		Date parse2; 
		try {
			parse1 = sdfDate.parse(date1);
			parse2 = sdfDate.parse(date2);
			return getDayNum(parse1,parse2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
}
	
	
	
	/**
	* @Title: getDayNum  
	* @Description: 计算指定日期距离今天过去多少天或还有多少天  
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
	
	/**
	* @Title: isToday  
	* @Description: 验证指定日期是否是今天 
	* @param @param thisDate
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean isToday(String thisDate) {
		Date date = new Date();
		String dateStr = sdfDate.format(date);
		//今天与指定日期进行比较
		return dateStr.equals(thisDate);
	}
	
	/**
	* @Title: inWeek  
	* @Description: 验证指定日期是否在本周
	* @param @param date
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws
	 */
	public static boolean inWeek(Date date) {
		//获取日历组件
		Calendar calendar = Calendar.getInstance();
		//今天是一周的第几天（周日为第一天）
		int  thisDayInWeek= calendar.get(Calendar.DAY_OF_WEEK);
		//设本周的第一天的日期（周一）
		calendar.set(Calendar.DAY_OF_WEEK, thisDayInWeek-1);
		Date startDate = calendar.getTime();
		
		//本周的最后一天
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		Date endDate = calendar.getTime();
		
		return compare(startDate,date)>=0 && compare(endDate,date)<=0;
	}
	public static boolean inWeek(String date) {
		try {
			return inWeek(sdfDate.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	//比较时间
	public static int compare(Date date1,Date date2) {
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		if(time1==time2) {
			return 0;
		}
		if(time1<time2) {
			return 1;
		}
		return -1;
	}
	
	
	public static boolean inMonth(Date thiDate) {
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
	
	public static void main(String[] args) {
		System.out.println(inWeek("2020-01-12"));
		
	}
	
	
}
