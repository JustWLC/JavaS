package exthread;

public class Mythread1 extends Thread {
	public void run(){
		System.out.println("Mythread1 run priority="+this.getPriority());
		Mythread2 thread2=new Mythread2();
		thread2.start();
	}
	
}
