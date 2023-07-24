package DAA_lab;
import java.util.*;
class kruskal{
	int n,c[][],st[][],par[];
	void read(){
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the no of vertices");
		n=scr.nextInt();
		c=new int[n+1][n+1];
		par=new int[n+1];
		System.out.println("enter the cost adjacensy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				c[i][j]=scr.nextInt();
		for(int i=1;i<=n;i++)
			par[i]=i;
	}
	int find(int i){
		i=par[i];
		return i;
	}
	void algo(){
		int mincost=0,e=0,min,u=0,v=0,a,b;
		st=new int[n+1][n+1];
		for(int i=1;i<n;i++)
			for(int j=1;j<=n;j++)
				st[i][j]=c[i][j];
		System.out.println("mincost spanning tree is:");
		while(e!=n-1){
			min=999;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(min>st[i][j]){
						min=st[i][j];
						u=i;
						v=j;
					}
			System.out.println(u+"<->"+v);
			st[u][v]=999;
			a=find(u);
			b=find(v);
			if(a!=b){
				e++;
			System.out.print(e+":");
			System.out.println(u+"<->"+v+"cost:"+min);
			unions(a,b);
			mincost=mincost+min;
		}
		else
			System.out.println(u+"<->"+v+"rejected:forms a cycle");
		}
	System.out.println("cost spanning tree"+mincost);
}

void unions(int i,int j)
{
	par[j]=i;
}
}
public class kruskalDemo {
	public static void main(String[] args) {
		kruskal k=new kruskal();
		k.read();
		k.algo();
	}

}
