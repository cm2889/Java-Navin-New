package Thread;

public class DeamonIsAliveNonDeamon {
public static void main(String[] args) {
	System.out.println("Main Thread Startd ");
	Imam imam = new Imam();
	
	imam.setDaemon(true);
	imam.start();
	System.out.println("Main Thread Ended: "+imam.x);
}
}
 class Imam extends Thread{
	 int x;
	 public void run() {
		 for(x=0;x<10000;x++) {
			 x++;
		 }
		System.out.println("My Thread Ended: "+x); 
		
	}
 }
