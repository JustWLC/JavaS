package com.imooc;

public class MachesTest {
public static void main(String[] args){
	//创建用字符串表示的正则表达式
	String paterStr="\\d{4}-\\d{2}-\\d{2}";
	//创建两个待匹配的字符串
	String s1="3333-33-33";
	String s2="33-33-33";
	
	//对字符串是是s1进行匹配检查
	if(s1.matches(paterStr)){
		System.out.println("匹配成功！");
	}
	else{
		System.out.println("匹配失败！");
	}
	if(s2.matches(paterStr)){
		System.out.println("匹配成功！");
		}
	else{
		System.out.println("匹配失败！");
	}
}
}
