package simplilearn.java;

public class RunnableDemo implements Runnable {

	public static int myCount = 0;

	@Override
	public void run() {
		while (RunnableDemo.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++RunnableDemo.myCount));
				Thread.sleep(100);

			} catch (InterruptedException e) {
				System.out.println("Exception in thread: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		RunnableDemo rDemo = new RunnableDemo();
		Thread t = new Thread(rDemo);
		t.start();

		while (RunnableDemo.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++RunnableDemo.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");

	}
}
