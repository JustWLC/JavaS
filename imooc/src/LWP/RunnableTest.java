package LWP;
/*
 * ʵ��Runnable�ӿڵ��࣬��Ҫ�ȶ���һ����Ϊrun�������޲η�����ʵ����Runnable�ӿڵ���
 * ����Ҫ��Thread������Ϳ������У�ֻ��Ҫʵ����һ��Thread���󣬲��ҽ��Լ���������Ϊ
 * һ���������ݸ�THread���췽��������
 */
public class RunnableTest {
public static void main(String []args){
	MythreadTest mt=new MythreadTest();
	Thread thr=new Thread(mt);
	thr.start();
	for(int i=0;i<10;i++){
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("��"+i+"RunnableTest");
	}
}
}
class MythreadTest implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("��"+i+"MythreadTest");
		}
	}
}