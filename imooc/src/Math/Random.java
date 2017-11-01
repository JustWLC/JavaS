package Math;

public class Random {
public static void main(String[] args){
	int r=(int)MathTest();
	for(int i=0;i<10;i++){
		System.out.println(r);
	}
}
public static double MathTest(){
	double MathTest=Math.random()*100;
	return MathTest;
}
}
