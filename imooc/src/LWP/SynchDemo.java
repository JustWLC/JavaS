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
//Printer������ģ���ӡ���������Ի����Ϣ�������Ǵ�ӡ����
class Printer{
	//��ӡ����
	void printScore(String name,int score1,int score2,int score3){
		System.out.println(name+"�ĳɼ�:");
		System.out.print(name+"Ӣ��");
		System.out.println(score1);
		//Ϊ��ʹ�������н�����ԣ��ڴ�ӡ�������ô�ӡ��������һ��ʱ��
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.print(name+"��ѧ");
		System.out.println(score2);
		System.out.print(name+"����");
		System.out.println(score3);
	}
}
//��ʦ�࣬ÿ����ʦ�����Լ����̲߳��ҹ���һ����ӡ��
class Teacher implements Runnable{
	Printer ps;  //��ӡ��
	String name;  //����
	 
	int score1=0;      //�ɼ�
	int score2=0;
	int score3=0;
	//��ʦ��Ĺ��캯��
	Teacher(Printer printer,String nm,int s1,int s2,int s3){
		ps=printer;
		name=nm;
		score1=s1;
		score2=s2;
		score3=s3;
	}
	//��ʦ���ô�ӡ��
	
	public void run(){
		synchronized(ps){  //����ps�������䵥�̲߳���
			ps.printScore(name, score1, score2, score3);//����printScore����
		}
	}
}
