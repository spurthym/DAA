import java.util.*;

public class quicksortalgorithm {
	final static int max=1005;
	static int a[]=new int[max];
	public static void main(String[]args)
	{
		int n;
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=ip.nextInt();
		//Random random=new Random();
		//for(int i=0;i<n;i++)
		//	a[i]=5000+random.nextInt(1000);
		//System.out.println("the generated elements are");
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			a[i]=ip.nextInt();
		
		System.out.println("the elements are");


		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		long starttime=System.nanoTime();
		quicksort(0,n-1);
		long stoptime=System.nanoTime();
		long elapsedtime=stoptime-starttime;
		System.out.println("the sorted arry is ");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println("the time complexity for n" +n+" is"+(double)elapsedtime/1000000+"ms");
    }
	public static void quicksort(int p ,int r)
	{
		int i,j,pivot,temp;
		if(p<r)
		{
			
			i=p;
			j=r+1;
			pivot=a[p];
			while(true) {
			i++;
			while(a[i]<pivot&&i<r)
				i++;
			j--;
			while(a[j]>pivot)
				j--;
			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else 
				break;
		}
			a[p]=a[j];
			a[j]=pivot;
			quicksort(p,j-1);
			quicksort(j+1,r);
			
		}
	}
			

}
