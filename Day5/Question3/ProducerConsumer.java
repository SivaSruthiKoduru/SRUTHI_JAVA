package Question3;

class ProducerConsumer{
	int item=0;
	 synchronized public void producer() {
		if(item==1) 
		{
			try
			{
				wait();
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		item=item+1;
		System.out.println("Producer produced item "+item);
		notify();
	}
	
	 synchronized public void consumer() {
		if(item==0)
		{
			
			try
			{
				wait();
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Consumer consumed item "+item);
		item=item-1;
		notify();
	}
}
