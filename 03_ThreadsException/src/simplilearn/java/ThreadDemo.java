package simplilearn.java;

public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		System.out.println("concurrent thread started running..");
	}

	public static void main(String[] args) {
		
		ThreadDemo demo = new ThreadDemo();
		demo.start();
	}

}
