package LWP;

public class Police implements Runnable {
public String name;
public Police(String name){
	this.name=name;
}
	public void run() {
	System.out.println(name+"����ִ������");	
    }
	public static void main(String[] args){
		Thread t1=new Thread(new Police("��������"));
		Thread t2=new Thread(new Police("��ͨ����"));
		Thread t3=new Thread(new Police("��������"));
	    t1.setPriority(4);
	    t2.setPriority(3);
	    t3.setPriority(9);
	    t1.start();
	    t2.start();
	    t3.start();
	}

}
