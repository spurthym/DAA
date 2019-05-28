import java.util.*;

public class primsclass {
static final int max=20;
static int cost[][],n;
static Scanner ip=new Scanner(System.in);
public static void main(String []args)
{   
	cost=new int [max][max];
	read();
	prims();
}
static void read()
{
	System.out.println("enter number of edges");
	n=ip.nextInt();
	System.out.println("enter cost adjacency matrix");
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
		{
			cost[i][j]=ip.nextInt();
			if(cost[i][j]==0)
				cost[i][j]=999;
		}

	
}
static void prims()
{
	int ne=1,i,j,a=0,b=0,v=0,u=0,min=0,mincost=0;
	int visited[]=new int[max];
	visited[1]=1;
	while(ne<n)
	{
		for(i=1,min=999;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(cost[i][j]<min)
					if(visited[i]!=0)
					{
						min=cost[i][j];
						a=u=i;
						b=v=j;
					}
		    }
		}
		if(visited[u]==0||visited[v]==0)
		{
			System.out.println("edge "+ne+++"("+a+","+b+") cost"+min);
			mincost+=min;
			visited[b]=1;

		}
		cost[a][b]=cost[b][a]=999;
	}
	System.out.println("the mincost is "+mincost);

}


}
