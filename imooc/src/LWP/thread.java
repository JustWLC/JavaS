package LWP;

public class thread {
	public static void main(String[] args){
		MyThread mt=new MyThread();
		mt.start();
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			System.out.println("第"+i+"ThreadDemo");
		}
	}
}
class MyThread extends Thread{
	//重写run方法
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(10);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();
				/*
				 * 类InterruptedException 当线程在活动之前或活动期间处于正在等待、休眠或
				 * 占用状态且该线程被中断时，抛出该异常。
				 */
			}
			System.out.println("第"+i+"MyThread");//在线程中打印出相关的信息
		}
	}
}