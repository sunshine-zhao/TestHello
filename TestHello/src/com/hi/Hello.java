package com.hi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Hello {
public static void main(String[] args) {
	System.out.println("Hello111");
	Calendar ca=Calendar.getInstance();
	System.out.println(ca.get(Calendar.MONTH));
	ca.add(Calendar.MONTH, 1);
	ca.set(Calendar.DAY_OF_MONTH,0);
	System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(ca.getTime()));
	System.out.println(ca.get(Calendar.DAY_OF_MONTH));
}
}
