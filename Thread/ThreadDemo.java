package Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		A obj = new A();
		obj.start();
		for(int i=0;i<10;i++) {
			System.out.println(2);
			 try {
				Thread.sleep(00);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
	}
}

 class A extends Thread {
	 @Override
	 public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(1);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
 }
