package LWP;

import java.util.LinkedList;

public class SurgeryThreadPool {
private static Runnable createTask(final int taskID){
	return new Runnable(){
		public void run(){
			System.out.println("手术开始，编号为："+taskID);
			System.out.println("正在手术中~~");
			System.out.println("手术结束，编号为"+taskID);
		}
	};
}
public static void main(String[] args){
	ThreadTask threadPool=new ThreadTask(3);
	try{
		Thread.sleep(60);
		
	}catch(InterruptedException e){
		System.out.println("线程休眠出错："+e.getMessage());
	}
	for(int i=0;i<3;i++){
		threadPool.addTask(createTask(i));
	}
	threadPool.waitTaskClosed();
	threadPool.closePool();
}

}
class ThreadTask extends ThreadGroup{//继承线程组实现线程池功能
	private boolean isStop=false;//线程池是否关闭
	private LinkedList queue;//工作任务队列
	private static int poolID=1;//线程池编号
	//负责从工作队列中取出任务并执行的内部类  
	private class SurgeryTask extends Thread{
		private int id;
		public SurgeryTask(int id){//构造方法进行初始化
			super(ThreadTask.this,id+" ");
			this.id=id;
			
		}
		public void run(){
			while(!isInterrupted()){
				Runnable task=null;
				task=getTask(id);//取出任务
				if(task==null)
					return ;
				try{
					task.run();
				}catch(Throwable t){
					t.printStackTrace();
				}
			}
			
		}
	}
	public ThreadTask (int size){
		super(poolID+ "");//指定线程组的名字
		setDaemon(true);
		queue=new LinkedList();//创建工作任务队列
		for(int i=0;i<size;i++){
			new SurgeryTask(i).start();
		}
		
	}
	public synchronized void addTask(Runnable task){
		if(isStop){
			throw new IllegalStateException();//抛出不合理的状态异常
		}
		if(task!=null){
			queue.add(task);//向任务队列中加入一个任务
			notify();       //唤醒等待任务的工作任务线程
		}
	}
	private synchronized Runnable getTask(int id){//取出任务
		try{
			while(queue.size()==0){
				if(isStop)
					return null;
				System.out.println("病人"+id+"正在等待手术。。。");
				wait();
			}
		}catch(InterruptedException e){
			System.out.println("等待治疗出现错误："+e.getMessage());
		}
		System.out.println("病人"+id+"开始执行手术。。。");
		return (Runnable)queue.removeFirst();//返回第一个任务并从队列中删除
		
	}
	public synchronized void closePool(){
		if(!isStop){
			waitTaskClosed();
			isStop=true;
			queue.clear();
			interrupt();
			
		}
	}
	public void waitTaskClosed(){
		synchronized (this){
			isStop=true;
			notifyAll();
		}
		Thread[] threada =new Thread[activeCount()];
		int count=enumerate(threada);
		for(int i=0;i<count;i++){
			try{
				threada[i].join();
			}catch(InterruptedException e){
				System.out.println("手术失败"+e.getMessage());
			}
		}
	}
	
}
