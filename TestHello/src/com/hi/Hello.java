package com.hi;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Hello {
public static void main(String[] args) {
//	System.out.println("Hello111222dfd");
//	Calendar ca=Calendar.getInstance();
//	System.out.println(ca.get(Calendar.MONTH));
//	ca.add(Calendar.MONTH, 1);
//	ca.set(Calendar.DAY_OF_MONTH,0);
//	System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(ca.getTime()));
//	System.out.println(ca.get(Calendar.DAY_OF_MONTH));
////	String ss="";
////	boolean equals = ss.equals("a");
////	System.out.println(equals);
//	String s1="abc";
//	System.out.println(s1.replace("ab","xx"));
//	time();
//	t1();
//	String default1 = getStringOrDefault("1",String.valueOf(1));
//	System.out.println(default1);
	Map map =new HashMap();
	map.put("abaac",null);
	map.put("c",new ArrayList());
	map.put("time","20200521");
	map.put("time1","2020052");
	System.out.println(map.get("abaac"));
	System.out.println(map.get("c"));
	System.out.println(map);
	String ss="01,00";
	System.out.println(ss.charAt(0));
	System.out.println(ss.split(",").length);
	System.out.println("".equals(""));
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

	System.out.println(sdf.format(new Date()));
	BigDecimal big = new BigDecimal("232");
	System.out.println(big.subtract(new BigDecimal("234")));
//	getDate();
	
}
public static void time(){
	Date date=new Date();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String t1 = format.format(date);
	System.out.println(t1);
	String t2 = format.format(date.getTime());
	System.out.println(t2);
}
public static void t1(){
	System.out.println(!false&&true);
	System.out.println("a,b,c".indexOf("1"));
}

public static String getStringOrDefault(Object o,String str){
	if(o instanceof String){
		String os=(String)o;
		if(os!=null&&os.length()>0){
			return os;
		}
	}
	return str;
}
//Date
public static void  getDate(){
	Date date=new Date();
	System.out.println(date.getTime());
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	System.out.println(sdf.format(date));
	String time="00000000";
	SimpleDateFormat sss=new SimpleDateFormat("YYYYMMDD");
	try {
		System.out.println(sdf.format(sss.parse(time)));
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
   
}}
