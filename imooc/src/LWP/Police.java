package LWP;

public class Police implements Runnable {
public String name;
public Police(String name){
	this.name=name;
}
	public void run() {
	System.out.println(name+"正在执行任务");	
    }
	public static void main(String[] args){
		Thread t1=new Thread(new Police("户籍警察"));
		Thread t2=new Thread(new Police("交通警察"));
		Thread t3=new Thread(new Police("国防警察"));
	    t1.setPriority(4);
	    t2.setPriority(3);
	    t3.setPriority(9);
	    t1.start();
	    t2.start();
	    t3.start();
	}

}
