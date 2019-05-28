import java.util.*;
public class floydclass {
	final static int max=20;
	static int n;
	static int a[][];
	static Scanner ip=new Scanner(System.in);

	public static void main(String[] args) {
		a=new int[max][max];
		read();
		floyd();
		print();

	}
	static void read()
	{
		System.out.println("enter number of nodes");
		n=ip.nextInt();
		System.out.println("enter the cost matrix(999)for infinity");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				a[i][j]=ip.nextInt();
			}
	}
	static void floyd()
	{
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(a[i][k]+a[k][j]<a[i][j])
						a[i][j]=a[i][k]+a[k][j];
	}

	static void print()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)

			System.out.print(a[i][j]+"\t");
			System.out.println();

		}


	}
}
