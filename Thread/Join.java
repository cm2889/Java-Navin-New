package Thread;

import java.util.Formatter;

public class Join {
	public static void main(String[] args) {
		cm imam = new cm() ;
		imam.start();
		try {
			imam.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(imam.i);
		
	}

}
class cm extends Thread{
	int i;
	public void run() {
		for(i=0;i<10000;i++){
			i++;
		}
	}
	
}
