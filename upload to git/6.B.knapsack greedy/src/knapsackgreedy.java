import java.util.*;
class kobject{
	float w,p,r;
}
public class knapsackgreedy {
	final static int max=20;
    static int n;
    static float m;
	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);
    System.out.println("enter  the number of objects");
    n=ip.nextInt();
    kobject obj[]=new kobject[n];
    for(int i=0;i<n;i++)
    	obj[i]=new kobject();
    readobjects(obj);
    knapsack(obj);
    ip.close();
    }
	static void readobjects(kobject obj[])
	{
		Scanner ip=new Scanner(System.in);
		kobject temp=new kobject();
	    System.out.println("enter  the capacity of knapsack");
	    m=ip.nextFloat();
	    System.out.println("enter  the weights");
	    for(int i=0;i<n;i++)
	    	obj[i].w=ip.nextFloat();
	    System.out.println("enter  the profits");
	    for(int i=0;i<n;i++)
	    	obj[i].p=ip.nextFloat();
	    for(int i=0;i<n;i++)
	    	obj[i].r=obj[i].p/obj[i].w;
	    for(int i=0;i<n-1;i++)
		    for(int j=0;j<n-i-1;j++)
		    	if(obj[j].r<obj[j+1].r)
		    	{
		    		temp=obj[j];
		    		obj[j]=obj[j+1];
		    		obj[j+1]=temp;
		    	}
	    ip.close();
	}
	
	    
static void knapsack(kobject kobj[])

{
	int i;
	float x[]=new float[n];
    for(i=0;i<n;i++)
    	x[i]=0;
    float u=m;
    
    float totalprofit=0;
    for( i=0;i<n;i++)
   if(kobj[i].w>u)
	   break;
   else
    {
    	  x[i]=1;
    	  totalprofit+=kobj[i].p;
    	  u=u-kobj[i].w;
    	  
    }
    if(i<n)
    	x[i]=u/kobj[i].w;
    totalprofit+=x[i]*kobj[i].p;
    System.out.println("the solution vector is");
    for( i=0;i<n;i++)
        System.out.println(x[i]+" ");
    System.out.println("the total profit is"+totalprofit);


    	

    

    		
   

	
}

	    

	    
	    

		
	}
