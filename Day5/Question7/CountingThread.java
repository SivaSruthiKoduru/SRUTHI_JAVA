package Question7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread{
	
	static int i = 1;

	public static void main(String[] args) {
		CountingThread countingthread = new CountingThread();
		ExecutorService executorservice = Executors.newFixedThreadPool(1);
		executorservice.execute(() -> {
			for (int i = 1; i <= 100; i++) {
				countingthread.countNum();
			}
		});
	}

	synchronized public void countNum() {
		Thread thread = Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println(i);

		if (i % 10 == 0) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Message");

		}
		i++;
	}

}
