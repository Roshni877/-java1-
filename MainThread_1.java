class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		start();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("ChildThread "+i);
			try {
				Thread.sleep(1);
			}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}	
	}
}
public class MainThread_1 {

	public static void main(String[] args) {
		MyThread t1=new MyThread("ChildThread");
                for(int i=1;i<=5;i++){
                    System.out.println("MainThread:"+i);
                    try{
                        Thread.sleep(1);
                    }catch(InterruptedException e){
                System.out.println("Main Thread Interrupted");
                    }}}}
		

	

