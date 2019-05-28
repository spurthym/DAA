
import java.util.Scanner;
public class Hamiltonian {
	boolean found = false;
	int g[][], x[], n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamiltonian hc = new Hamiltonian();
		hc.getData();
		hc.HamiltonianMethod(2);
		hc.printNoSolnPossible();
	}
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of vertices: ");
		n = sc.nextInt();
		g = new int[n + 1][n + 1];
		x = new int[n + 1];
		System.out.println("If there's an edge between the following vertices then enter 1, else 0.");
		for (int i = 1; i <= n; i++)
			for (int j = i; j <= n; j++) {
				if (i == j) {
					g[i][j] = 0;
					continue;
				}
				System.out.print(i + " and " + j + ": ");
				g[i][j] = g[j][i] = sc.nextInt();
			}
		for (int i = 1; i <= n; i++)
			x[i] = 0;
		x[1] = 1;
		sc.close();
	}
	void printNoSolnPossible() {
		if (found == false)
			System.out.println("No solution possible.");
	}
	void HamiltonianMethod(int k) {
		while (true) {
			nextValue(k);
			if (x[k] == 0)
				return;
			if (k == n) {
				for (int i = 1; i <= k; i++)
					System.out.print(x[i] + " ");
				System.out.println(x[1]);
				found = true;
			} else
				HamiltonianMethod(k + 1);
		}
	}
	void nextValue(int k) {
		while (true) {
			x[k] = (x[k] + 1) % (n + 1);
			if (x[k] == 0)
				return;
			if (g[x[k - 1]][x[k]] != 0) {
				int i;
				for (i = 1; i < k; i++)
					if (x[k] == x[i])
						break;
				if (i == k)
					if ((k < n) || ((k == n) && g[x[n]][x[1]] != 0))
						return;
			}
		}
	}

	
}