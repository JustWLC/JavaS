package com.imooc;

import java.util.Random;

public class RedGreenLight {
public static void main(String[] args)throws InterruptedException{
	int x=10;
	while(x>0){
		int i = new Random().nextInt(100);
		if(i%2==0){
			i--;
			System.out.println("绿灯，可以继续行驶...");
			x--;
		}
		else{
			Thread.sleep(1000);
			System.out.println("红灯，禁止前行...");
			x--;
		}
	}
}
}
