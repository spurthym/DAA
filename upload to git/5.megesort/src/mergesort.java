import java.util.*;
public class mergesort {
	static final int max=10005;
	static int a[]=new int[max];
	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the maximum array size");
		int n=ip.nextInt();
		System.out.println("enter aray elements");
		for(int i=0;i<n;i++)
			a[i]=ip.nextInt();
		System.out.println("the elements are");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		long starttime=System.nanoTime();
		mergesortalgorithm(0,n-1);
		long stoptime=System.nanoTime();
		long elapsedtime=stoptime-starttime;
		System.out.println("the sorted arry is ");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println("the time complexity for n " +n+" is "+(double)elapsedtime/1000000+"ms");
	}
	public static void  mergesortalgorithm(int low,int high)
	{ int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			mergesortalgorithm(low,mid);
			mergesortalgorithm(mid+1,high);
			merge(low,mid,high);
		}
	}

	public static void merge(int low,int mid ,int high)
	{
		int b[]=new int[max];
		int h ,i,j,k;
		h=i=low;
		j=mid+1;
		while((h<=mid)&&(j<=high))
		
			if(a[h]<a[j])
			
				b[i++]=a[h++];
			
			else
			
				b[i++]=a[j++];
						
			
		
			if(h>mid)
			
				for(k=j;k<=mid;k++)
					b[i++]=a[k];
				
			
			else
			
				for(k=h;k<=mid;k++)
					b[i++]=a[k];

					
			
			for(k=low;k<=high;k++)
				a[k]=b[k];
		}
	}

