package Question3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory {
	public static void main(String[] args) {
		ProducerConsumer producerconsumer=new ProducerConsumer();
		ExecutorService executorservice = Executors.newFixedThreadPool(2);
		executorservice.execute(()->
		{
			for(int i=0;i<5;i++)
			{
				
				producerconsumer.producer();
			}
		
			
		});
		executorservice.execute(()->
		{
			for(int i=0;i<5;i++)
			{
				
				producerconsumer.consumer();
			}
		});
	}

}
