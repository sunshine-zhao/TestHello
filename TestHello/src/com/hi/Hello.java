package com.hi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Hello {
public static void main(String[] args) {
//	System.out.println("Hello111");
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
	String default1 = getStringOrDefault("1",String.valueOf(1));
	System.out.println(default1);
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
}
