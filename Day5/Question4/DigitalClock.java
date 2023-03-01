package Question4;

import java.util.concurrent.ExecutorService;
import java.time.LocalTime;
import java.util.concurrent.Executors;

public class DigitalClock{
	public static void main(String[] args) {
		Clock c = new Clock();
			ExecutorService es = Executors.newFixedThreadPool(3);
			es.execute(()->
			{
				try 
				{
					while(true)
					{
						Thread.sleep(1000);
						c.display();
						
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			});
			
		
		
	}

}
class Clock
{
	int hrs;
	int min;
	int sec;
	Clock(){
		LocalTime localtime = LocalTime.now();
		hrs = localtime.getHour();
		min = localtime.getMinute();
		sec = localtime.getSecond();
	}
	
	void display() {
		sec+=1;
		if(sec==59) {
			min+=1;
			sec=0;
		}
		if(min==59) {
			hrs+=1;
			min=0;
		}
		if(hrs==23&&min==59) {
			hrs=0;
			min=0;
			sec=0;
		}
		System.out.printf("%02d:%02d:%02d\n",hrs,min,sec);
	}
			
}