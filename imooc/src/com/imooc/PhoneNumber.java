package com.imooc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
public static void main(String[] args){
	Scanner reader=new Scanner(System.in);
	System.out.print("请输入号码：");
	String n=reader.next();
	String r="^1[3|4|5|8]\\d{9}$";
	Pattern p=Pattern.compile(r);
	boolean b=p.matcher(n).matches();
	if(b){
		System.out.println(n+"是一个手机号");
	}else{
		System.out.println(n+"不是一个手机号");
	}
	
}
}
