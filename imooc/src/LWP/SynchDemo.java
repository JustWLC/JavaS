package LWP;

public class SynchDemo {
public static void main(String[] args){
 Printer ps=new Printer();
 
 Teacher t1=new Teacher(ps,"kk",45,56,67);
 Teacher t2=new Teacher(ps,"hh",67,56,67);
 Teacher t3=new Teacher(ps,"ll",33,89,67);
 Thread td=new Thread(t1);
 Thread tv=new Thread(t2);
 Thread tb=new Thread(t3);
 td.start();
 tv.start();
 tb.start();

}
}
//Printer类用来模拟打印机，它可以获得信息并把它们打印出来
class Printer{
	//打印方法
	void printScore(String name,int score1,int score2,int score3){
		System.out.println(name+"的成绩:");
		System.out.print(name+"英语");
		System.out.println(score1);
		//为了使程序运行结果明显，在打印过程中让打印工作休眠一段时间
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.print(name+"数学");
		System.out.println(score2);
		System.out.print(name+"语文");
		System.out.println(score3);
	}
}
//教师类，每个教师都有自己的线程并且公用一个打印机
class Teacher implements Runnable{
	Printer ps;  //打印机
	String name;  //姓名
	 
	int score1=0;      //成绩
	int score2=0;
	int score3=0;
	//教师类的构造函数
	Teacher(Printer printer,String nm,int s1,int s2,int s3){
		ps=printer;
		name=nm;
		score1=s1;
		score2=s2;
		score3=s3;
	}
	//教师调用打印机
	
	public void run(){
		synchronized(ps){  //锁定ps对象，让其单线程操作
			ps.printScore(name, score1, score2, score3);//调用printScore方法
		}
	}
}
