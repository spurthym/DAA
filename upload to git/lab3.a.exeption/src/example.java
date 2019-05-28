import java.util.Scanner;
public class example {

	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);

		int a,b,result;
		System.out.println("enter two integers");
		a=ip.nextInt();
		b=ip.nextInt();

		try
		{
			result=a/b;
			System.out.println("result="+result);

			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("exeption :division by zero");

		}
	}
}