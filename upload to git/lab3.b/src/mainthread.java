import java.util.*;
import java.util.Random;
class squarethread implements Runnable
{int x;
	squarethread(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("name of string is squarethread and square of "+ x +"is"+x*x);
	}
}
class cubethread implements Runnable
{int x;
	cubethread(int x)
	{
		this.x=x;
		
	}
	public void run()
	{
		System.out.println("name of string is cubethread and cube of "+ x +"is"+x*x*x);
		
	}
	
}
class randomthread implements Runnable
{
	Random r=new Random();
	Thread t2,t3;
	public void run()
	{
		int num;
		try
		{while(true)
		{
			num=r.nextInt(100);
			System.out.println("the generated number is"+num);
			t2=new Thread(new squarethread(num));
			t2.start();
			t3=new Thread(new cubethread(num));
			t3.start();
			Thread.sleep(1000);
		}
			
		}
		catch(Exception ex)
		{
			System.out.println("interrupted");

		}
	}
}
	
	
public class mainthread {

	public static void main(String[] args) {
		randomthread thread=new randomthread();
		Thread t1=new Thread(thread);
		t1.start();
	}

}
