package Practice;

import java.util.Scanner;

public class JieCheng {
public static void main(String[] args){
	JieCheng h=new JieCheng();
	System.out.println("���1��+2��+....+n!֮��");
	System.out.print("������n��");
	Scanner scr=new Scanner(System.in);
	h.accept(scr.nextInt());
	scr.close();
}
public void accept(int i){
     int sum=0,a=1;
     int k=1;
     while(k<=i){
    	 sum=sum+a;
    	 k++;
    	 a=a*k;
     }
System.out.println("sum:"+sum);
 	}
 

}
 
	


