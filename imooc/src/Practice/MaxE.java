package Practice;

import java.util.Scanner;

public class MaxE {
public static void main(String[] args){
	MaxE t=new MaxE();
    Scanner scr=new Scanner(System.in);
    System.out.print("请输入sum值：");
    t.p(scr.nextInt());
    scr.close();
}
public void p(int i){
	int n=0;
	int sum=0;
	while(true){
		n++;
		sum+=n;
		
		if(sum>=i)break;
	}
	System.out.println("n最大为："+n);
	
}
}
