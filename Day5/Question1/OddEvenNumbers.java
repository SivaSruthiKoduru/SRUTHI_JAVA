package Question1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenNumbers{
	public static void main(String[] args) {
		OddEven oddeven= new OddEven();
		ExecutorService executorservice = Executors.newFixedThreadPool(2);
		executorservice .execute(()->
		{  synchronized(oddeven) {
			System.out.println("Odd Numbers");
			oddeven.printOdd();
		}
			
		}
		);
		
		executorservice.execute(()->
		{
			synchronized(oddeven) {
			System.out.println("\nEven Numbers");

			oddeven.printEven();
			}
			
		}
		);
		executorservice.shutdown();
		
		
	}
	
			

}


