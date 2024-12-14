class MyRunnable implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Thread " +Thread.currentThread().getId() + "running...");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MainThreads {

	public static void main(String[] args) {
		MyRunnable myrunnable=new MyRunnable();
		Thread thread1=new Thread(myrunnable);
		Thread thread2=new Thread(myrunnable);
		Thread thread3=new Thread(myrunnable);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}