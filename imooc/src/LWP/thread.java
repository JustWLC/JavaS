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
			System.out.println("��"+i+"ThreadDemo");
		}
	}
}
class MyThread extends Thread{
	//��дrun����
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(10);
				
			}
			catch(InterruptedException e){
				e.printStackTrace();
				/*
				 * ��InterruptedException ���߳��ڻ֮ǰ���ڼ䴦�����ڵȴ������߻�
				 * ռ��״̬�Ҹ��̱߳��ж�ʱ���׳����쳣��
				 */
			}
			System.out.println("��"+i+"MyThread");//���߳��д�ӡ����ص���Ϣ
		}
	}
}