import java.util.*;
public class travelsalesperson {
final static int max=100;
static int infinity=999;
public static void main(String []args)
{
	int c[][]=new int [max][max];
	int tour[]=new int[max];
	int n,cost;
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the number of cities");
	n=ip.nextInt();
	System.out.println("enetr cost matrix");
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		{
			c[i][j]=ip.nextInt();
			if(c[i][j]==0)
				c[i][j]=999;
		} 
	for(int i=0;i<n;i++)
		tour[i]=i;
	cost=tspdp(c,tour,0,n);
	System.out.println("the min cost is"+cost);
	System.out.println("tour is");
	for(int i=0;i<n;i++)
		System.out.print(tour[i]+"->");
	System.out.println(tour[0]);
}
static int tspdp(int c[][],int tour[],int start,int n)

{
	int temp[]=new int[max],mintour[]=new int[max],cost,mincost,min,i,j,k;
	if (start==n-2)
	{
		return (c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0]);
	}
	mincost=infinity;
	for(i=start+1;i<n;i++)
	{
		for(j=1;j<n;j++)
			temp[j]=tour[j];
	temp[start+1]=tour[i];
	temp[i]=tour[start+1];
			if(c[tour[start]][tour[i]]+(cost=tspdp(c,temp,start+1,n))<mincost)
			{
				mincost=c[tour[start]][tour[i]]+cost;
				for(k=0;k<n;k++)
					mintour[k]=temp[k];
				
			}
	}

for(i=0;i<n;i++)
	tour[i]=mintour[i];
return mincost;

	
	
}
}

					
							
						
			
			
		
	



	


	


	


