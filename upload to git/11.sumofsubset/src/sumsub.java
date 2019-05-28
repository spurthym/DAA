import java.util.*;
public class sumsub {
	static int s[],d,soln[],n;
	static final int max=10;
	public static void main(String []args)
	{ s=new int[max];
	soln=new int[max];
	int sum=0;
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the nuber of subset value");
		n=ip.nextInt();
		System.out.println("enter the subset values");
		for(int i=1;i<=n;i++)
		{
			s[i]=ip.nextInt();
		}
		System.out.println("enter the max of subset value");
      d=ip.nextInt();
        for(int i=1;i<=n;i++)
	sum=sum+s[i];
       if(sum<d||s[1]>d)
	System.out.println("subset not possible");
        else sumofsub(0,0,sum);
	}
	static void sumofsub(int i,int weight,int total)
	{
		if(promising(i,weight,total)==true)
		
			if(weight==d)
			{
				for(int j=1;j<=i;j++) 
				{
					if(soln[j]==1)
						System.out.println(s[j]+" ");

				}
			System.out.println();
		}
			else
			{
				soln[i+1]=1;
						sumofsub(i+1,weight+s[i+1],total-s[i+1]);
						

				soln[i+1]=0;
						sumofsub(i+1,weight,total-s[i+1]);
			}
				
		}
	static boolean promising(int i,int weight,int total)
	{
		return ((weight+total>=d)&&(weight==d||weight+s[i+1]<=d));
	}
	}



