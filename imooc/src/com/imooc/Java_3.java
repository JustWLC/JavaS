package com.imooc;

public class Java_3 {
public static void main(String[] args){
	Person p=new Student("WD","计算机科学");
	System.out.println(p.getName()+','+p.getDescription());
	
}
}
abstract class Person{
	private String name;
	public Person(String n){
		name=n;
	}
	public abstract String getDescription();
	public String getName(){
		return name;
	}
	
}
class Student extends Person{
	private String major;
	public Student(String n,String m){
		super(n);
		major=m;
	}
	public String getDescription(){
		return"学生专业是："+major;
	}
	
}
