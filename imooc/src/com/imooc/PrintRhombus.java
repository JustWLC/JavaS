package com.imooc;

import java.util.Scanner;

public class PrintRhombus {
 public static void main(String[] args){
		Rhombus s=new Rhombus();
		System.out.print("请输入row：");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("绘制菱形如下：");
		s.row(i);
	}
 }
 class Rhombus{
		public void row(int n){
		if(n>=1){
			int x,y;
			for(x=1;x<=n;x++){
				for(y=1;y<=n-x;y++)
					System.out.print(" ");
				for(y=1;y<=2*x-1;y++)
					System.out.print("#");
				System.out.println();
			}
			for(x=1;x<=n;x++){
				for(y=1;y<=x;y++)
					System.out.print(" ");
				for(y=1;y<=2*(n-x)-1;y++)
					System.out.print("#");
				System.out.println();
		}
		}
	}
 }

