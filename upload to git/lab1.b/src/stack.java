import java.util.*;
class arraystk{
	int top;
	int s[];
	int maxstk;
	arraystk(int n)
	{
		maxstk=n;
		s=new int[maxstk];
		top=-1;
	}
	void push()
	{
		int item;
		Scanner ip=new Scanner(System.in);

		if(top==maxstk-1)
			System.out.println("\nstack overflow");
		else
		{
			System.out.println("\nenter item to be pushed");
			item=ip.nextInt();
			top=top+1;
			
			s[top]=item;

		}
	}
		void pop()
		{
			if(top==-1)
			{
				System.out.println("\nstack underflow");
			}
			else
			{
				System.out.println("\nitem deleted is:"+s[top]);
				top=top-1;

			}
		}
		void display()
		{
			if(top==-1)
			{
				System.out.println("\nstack underflow");
			}
			else
			{
				System.out.println("\nstack elements are");
			  for(int i=top;i>=0;i--)
					System.out.println(s[i]);

				  
			}
			
		}
		
		

	
}
public class stack {

	public static void main(String[] args)
	{
        int n;
		Scanner ip=new Scanner(System.in);

		System.out.println("enter max stack  size");
		n=ip.nextInt();
		arraystk stk=new arraystk(n);
		int ch;
		do
		{
			System.out.println("\n1.push\n2.pop\n3.display\nEnter your choice");
			ch=ip.nextInt();
			switch(ch)
			{
			case 1:stk.push();
			break;
			case 2:stk.pop();
			break;
			case 3:stk.display();
			break;
			default:System.out.println("wrong choice");
			
			}

		}while(ch<=3);

 
	}

}
