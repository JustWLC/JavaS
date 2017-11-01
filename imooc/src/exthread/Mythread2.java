package exthread;

public class Mythread2 extends Thread{
		public void run(){
			System.out.println("Mythread2 run priority="+this.getPriority());
		}

}
