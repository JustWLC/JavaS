package LWP;

import java.util.LinkedList;

public class SurgeryThreadPool {
private static Runnable createTask(final int taskID){
	return new Runnable(){
		public void run(){
			System.out.println("������ʼ�����Ϊ��"+taskID);
			System.out.println("����������~~");
			System.out.println("�������������Ϊ"+taskID);
		}
	};
}
public static void main(String[] args){
	ThreadTask threadPool=new ThreadTask(3);
	try{
		Thread.sleep(60);
		
	}catch(InterruptedException e){
		System.out.println("�߳����߳���"+e.getMessage());
	}
	for(int i=0;i<3;i++){
		threadPool.addTask(createTask(i));
	}
	threadPool.waitTaskClosed();
	threadPool.closePool();
}

}
class ThreadTask extends ThreadGroup{//�̳��߳���ʵ���̳߳ع���
	private boolean isStop=false;//�̳߳��Ƿ�ر�
	private LinkedList queue;//�����������
	private static int poolID=1;//�̳߳ر��
	//����ӹ���������ȡ������ִ�е��ڲ���  
	private class SurgeryTask extends Thread{
		private int id;
		public SurgeryTask(int id){//���췽�����г�ʼ��
			super(ThreadTask.this,id+" ");
			this.id=id;
			
		}
		public void run(){
			while(!isInterrupted()){
				Runnable task=null;
				task=getTask(id);//ȡ������
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
		super(poolID+ "");//ָ���߳��������
		setDaemon(true);
		queue=new LinkedList();//���������������
		for(int i=0;i<size;i++){
			new SurgeryTask(i).start();
		}
		
	}
	public synchronized void addTask(Runnable task){
		if(isStop){
			throw new IllegalStateException();//�׳��������״̬�쳣
		}
		if(task!=null){
			queue.add(task);//����������м���һ������
			notify();       //���ѵȴ�����Ĺ��������߳�
		}
	}
	private synchronized Runnable getTask(int id){//ȡ������
		try{
			while(queue.size()==0){
				if(isStop)
					return null;
				System.out.println("����"+id+"���ڵȴ�����������");
				wait();
			}
		}catch(InterruptedException e){
			System.out.println("�ȴ����Ƴ��ִ���"+e.getMessage());
		}
		System.out.println("����"+id+"��ʼִ������������");
		return (Runnable)queue.removeFirst();//���ص�һ�����񲢴Ӷ�����ɾ��
		
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
				System.out.println("����ʧ��"+e.getMessage());
			}
		}
	}
	
}
