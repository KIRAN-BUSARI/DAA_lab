import java.util.Scanner;
class prims{
	int n,c[][],st[][];
	void read() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		n = s.nextInt();
		c = new int[n+1][n+1];
		System.out.println("Enter the cost Adjacency matrix: ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				c[i][j] = s.nextInt();			
	}
	void primsAlgo(){
		int i, j, w, u=0, nr[], min, min_cost=0;
		st = new int[n+1][3];
		nr = new int [n+1];
		for(i=1;i<=n;i++)
			nr[i] = 1;
			nr[1] = 0;
		for( i=1;i<=n;i++) {
			min = 999;
			for(j=1;j<=n;j++) {
				if(nr[j] != 0 && c[j][nr[j]]<min) {
					min = c[i][nr[j]];
					u = j;
				}
			}
			st[i][1] = u;
			st[i][2] = nr[u];
			min_cost = min_cost+c[u][nr[u]];
			nr[u] = 0;
			for(w=1;w<=n;w++) {
				if(nr[w] != 0 && c[w][nr[w]]>c[w][u])
					nr[w] = u;
			}
			System.out.println("The minimum Spanning Tree is: ");
			for(i=1;i<=n;i++)
				System.out.println(st[i][1]+"<->"+st[i][2]);
			System.out.println("Minimum cost = "+min_cost);
		}
	}
}
public class primsDemo {
	public static void main(String[] args) {
		prims p = new prims();
		p.read();
		p.primsAlgo();
	}

}