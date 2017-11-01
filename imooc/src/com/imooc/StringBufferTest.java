package com.imooc;

public class StringBufferTest {
public static void main(String[] args){
	StringBuffer sb=new StringBuffer("abcdefg");
	System.out.println(sb);
	for(int i=0;i<sb.length();i++){
		char c=sb.charAt(i);
		System.out.println(c);
		c=(char)(c-32);
		sb.setCharAt(i, c);
	}
	System.out.println(sb);
}
}
