package Question5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStartWithExecutor {
	public static void main(String[] args) {
		ExecutorService executorservice = Executors.newFixedThreadPool(1);
		executorservice.execute(() ->
		{
			System.out.println("Called once");
		});
		executorservice.execute(() ->
		{
			System.out.println("Called twice");
		});

	}

}
