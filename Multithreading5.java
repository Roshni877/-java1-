package pkg1;
class MultiThreadingFive implements Runnable{
	int threadNumber;
	MultiThreadingFive(int tNo){
		this.threadNumber=tNo;
	}
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("Task"+i+ " by ThreadNumber "+ threadNumber);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
public class Multithreading5{
	public static void main(String[] args) {
		for(int i=1; i<8; i++) {
			MultiThreadingFive mt1=new MultiThreadingFive(i);
			Thread t1=new Thread(mt1);
			t1.start();
		}
		

	}

}