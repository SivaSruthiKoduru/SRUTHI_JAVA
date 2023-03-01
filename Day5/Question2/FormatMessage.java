package Question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FormatMessage {
	public static void main(String[] args) {
		DisplayMessage displaymessage= new DisplayMessage();
		ExecutorService executorservice = Executors.newFixedThreadPool(3);
		executorservice.execute(()->
		{
			synchronized(displaymessage) {
				displaymessage.display("1st message");
				
			}
			synchronized(displaymessage) {
				displaymessage.display("2nd message");
			}
			synchronized(displaymessage) {
				displaymessage.display("3rd message");
			}
			
			
		});
		
		executorservice.shutdown();
		
	}

}
