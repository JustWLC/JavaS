package com.imooc;

import java.util.Random;

public class RedGreenLight {
public static void main(String[] args)throws InterruptedException{
	int x=10;
	while(x>0){
		int i = new Random().nextInt(100);
		if(i%2==0){
			i--;
			System.out.println("�̵ƣ����Լ�����ʻ...");
			x--;
		}
		else{
			Thread.sleep(1000);
			System.out.println("��ƣ���ֹǰ��...");
			x--;
		}
	}
}
}
