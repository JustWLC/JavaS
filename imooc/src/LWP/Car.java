package LWP;

public class Car implements Runnable {
private boolean stop=false;
private String license;
public Car(){
	
}
public Car(String lic){
	this.license=lic;
}
	
	public void run() {
		// TODO Auto-generated method stub
for(int i=0;i<5&&!stop;i++){
	System.out.println((license==null?"无牌照汽车":license)+"正在行驶中。。。");
	if(i==3){
		System.out.println((license==null?"无牌照汽车":license)+"被警察检查");
		if(null==license){
			System.out.println("无牌照汽车被拦下");
			stop=true;
			
		}else{
			Thread.yield();
		}
	}
}
	}
public static void main(String[] args){
	Thread c1=new Thread(new Car("123"));
	Thread c2=new Thread(new Car());
	Thread c3=new Thread(new Car("789"));
	c1.start();
	c2.start();
	c3.start();
}
}
