import java.util.*;
public class knapsackdp {
	final static int max=20;
	static int n,m;
	static int p[],w[];
	static int v[][],keep[][];
	public static void main(String []args)
	{
		p=new int[max];
		w=new int[max];
		v=new int[max][max];
		keep=new int[max][max];
		int optsoln;
		readobjects();
		for(int i=0;i<=n;i++)
			v[0][i]=0;
		for(int i=0;i<=m;i++)
			v[i][0]=0;
		optsoln=knapsack();
		System.out.println("optimal solution"+optsoln);
	}
	static int knapsack()
	{
		int r;
		for (int i=1;i<=n;i++)
			for(int j=0;j<=m;j++)
				if(w[i]<=j&&(p[i]+v[i-1][j-w[i]]>v[i-1][j]))
				{
					v[i][j]=p[i]+v[i-1][j-w[i]];
					keep[i][j]=1;
				}
				else
				{
					v[i][j]=v[i-1][j];
					keep[i][j]=0;
				}
		r=m;
		System.out.println("items included are");
		for(int i=n;i>0;i--)
			if(keep[i][r]==1)
			{
				System.out.println("object "+i);
				r=r-w[i];
			}	
		return v[n][m];
	}
	static void readobjects()
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("kanpsack usiing dp");
		System.out.println("enter no of objects");
		n=ip.nextInt();
		System.out.println("enter max capacity");
		m=ip.nextInt();
		System.out.println("enter weights");
		for (int i=1;i<=n;i++)
		w[i]=ip.nextInt();
		System.out.println("enter profits");
		for (int i=1;i<=n;i++)
		p[i]=ip.nextInt();
		ip.close();
	}
}
