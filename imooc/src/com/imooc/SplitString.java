package com.imooc;

public class SplitString {
public static void main(String[] args){
	String s="荷叶生时春恨生，荷叶枯时秋恨成。深知身在情常在，怅望江头江水声。";
	String r="，|。";
	String[] ss=s.split(r,3);
	for(String a:ss){
		System.out.println(a);
	}	
}
}
