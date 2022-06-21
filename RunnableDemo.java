package assignment;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class demo implements Runnable{
   private Thread t;
   private String threadName;
   
   demo(String name)
   {
	   threadName=name;
	   System.out.println("creating thread:"+threadName);
   }
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("RUNNING"+threadName);
		try {
			 for(int i=0;i>4;i--)
			    { 
				 System.out.println("thread"+threadName+","+i);
			    }
			  	
		     }
		 catch(InterruptedException e)
		{
		System.out.println("thread"+threadName+"interrrupted");
		}
	
	
		
	System.out.println("thread"+threadName+"exiting");
	public void start()
	{
		System.out.println("strating thread"+threadName);
		if(t==null) {
			
		t=new Thread(this,threadName);
		t.start();
	}
	
	
	}
	
}