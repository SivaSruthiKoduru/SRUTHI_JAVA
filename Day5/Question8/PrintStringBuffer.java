package Question8;

public class PrintStringBuffer extends Thread{
	StringBuffer stringbuffer;
	public static void main(String[] args) {
		StringBuffer stringbuffer = new StringBuffer("A");
		PrintStringBuffer printstringbuffer1 = new PrintStringBuffer(stringbuffer);
		PrintStringBuffer printstringbuffer2 = new PrintStringBuffer(stringbuffer);
		PrintStringBuffer printstringbuffer3 = new PrintStringBuffer(stringbuffer);
		printstringbuffer1.start();
		printstringbuffer2.start();
		printstringbuffer3.start();
		
		
		
		
		
	}
	PrintStringBuffer(StringBuffer stringbuffer)
	{
		this.stringbuffer=stringbuffer;
		
	}
	public void run()
	{
		synchronized(stringbuffer)
		{
			for(int i=0;i<100;i++)
			{
				System.out.print(stringbuffer);
				
			}
			System.out.println();
			stringbuffer.setCharAt(0,(char)(stringbuffer.charAt(0)+1));
		}
	}

}
