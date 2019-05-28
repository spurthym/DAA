import java.util.*;
public class dk {
	final static int max=20;
	static int n,source,cost[][],dest[];
	static Scanner ip=new Scanner(System.in);
	public static void main(String[] args) {
	cost=new int[max][max];
    System.out.println("enter the number of nodes");
	n=ip.nextInt();
	System.out.println("enter the cost adjacency matrix");
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
			cost[i][j]=ip.nextInt();
	System.out.println("enter the source nde");
	source=ip.nextInt();
	dijkstra();
	for(int i=1;i<=n;i++)
	System.out.println("the shortest distance from source"+ source +" to dest "+ i + "is"+ dest[i]+"\n");
	}
	static void dijkstra()
	{ dest=new int[max];
		int infinity=999;
		int min,u=0;
		int i,j;
		int visited[]=new int[max];
		for(i=1;i<=n;i++)
		{
			visited[i]=0;
			dest[i]=cost[source][i];
		}
		visited[source]=1;
		for(i=0;i<n;i++)
		{
			min=infinity;
			for(j=1;j<=n;j++)
				if(visited[j]==0 && dest[j]<min)
				{
					min=dest[j];
					u=j;
				}
			visited[u]=1;
			for(j=1;j<=n;j++)
			{
				if(visited[j]==0 && (dest[u]+cost[u][j]<dest[j]))
						dest[j]=dest[u]+cost[u][j];
			}
					
		}
	}
}


