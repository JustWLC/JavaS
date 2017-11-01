package LWP;

public class Lunch implements Runnable {


	public void run() {
		for(int i=0;i<3;i++){
			System.out.println("ÕýÔÚ³ÔÎç·¹");
			try{
				Thread.sleep(3000);
				
			}catch(InterruptedException e){
				System.out.println();
			}
		}

	}

}
