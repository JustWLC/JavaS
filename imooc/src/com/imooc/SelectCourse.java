package com.imooc;

import java.util.Scanner;

public class SelectCourse {
public static void main(String[] args){
	
	
	    System.out.println("1:��ѧ");
		System.out.println("2:����");
		System.out.println("3:Ӣ��");
		System.out.println("4������");
		System.out.println("5:��ѧ");
		System.out.print("������ѡ��Ŀγ̺ţ�");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i){
		case 1:
			System.out.println("��ѡ�������ѧ�γ�");
			break;
		case 2:
		    System.out.println("��ѡ��������Ŀγ�");
		    break;
		case 3:
			System.out.println("��ѡ�����Ӣ��γ�");
			break;
		case 4:
			System.out.println("��ѡ���������γ�");
			break;
		case 5:
			System.out.println("��ѡ����ǻ�ѧ�γ�");
			break;
		}
		
}
}
