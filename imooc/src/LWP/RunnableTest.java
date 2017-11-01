package LWP;
/*
 * 实现Runnable接口的类，需要先定义一个名为run（）的无参方法。实现了Runnable接口的类
 * 不需要是Thread的子类就可以运行，只需要实例化一个Thread对象，并且将自己的引用作为
 * 一个参数传递给THread构造方法就行了
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
		System.out.println("第"+i+"RunnableTest");
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
			System.out.println("第"+i+"MythreadTest");
		}
	}
}