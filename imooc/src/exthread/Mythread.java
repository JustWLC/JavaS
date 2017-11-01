package exthread;

public class Mythread extends Thread{
	public void run(){
		long begintime=System.currentTimeMillis();
		int count=0;
		for(int i=0;i<50000000;i++){
			Thread.yield();
			count=count+i;
			
		}
		long endtime=System.currentTimeMillis();
		System.out.println("ÓÃÊ±£º"+(endtime-begintime)+"ºÁÃë");
	}
}
