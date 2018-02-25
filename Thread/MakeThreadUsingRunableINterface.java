package Thread;

public class MakeThreadUsingRunableINterface {
	public static void main(String[] args) {
	   
		myThread t1= new myThread();
		Thread t2= new Thread(t1);
		t2.start();
		System.out.println("Inside The main method"+Thread.currentThread().getName());
	}

}
class myThread extends Fatema implements Runnable {
	public void run() {
		System.out.println("Inside the Run method"+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
  class Fatema {
	
	
}