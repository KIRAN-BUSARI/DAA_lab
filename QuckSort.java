package DAA_lab;
import java.util.Scanner;
import java.util.Random;
class Quicksort_class{
	int n;
	int a[];
	Quicksort_class(int x){
		n=x;
		a=new int[n];
	}
	void generator() {
		System.out.println("Generating "+n+"Random numbers");
		Random r = new Random();
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt(100);
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	int partition(int a[],int lb,int ub) {
		Scanner s = new Scanner(System.in);
		int pi ,down,temp,up;
		pi = a[lb];
		down = lb;
		up = ub;
		while(down<up) {
			while((a[down]<=pi)&&(down<up))down++;
			while(a[up]>pi)up--;
			if(down<up) {
				temp = a[down];
				a[down] = a[up];
				a[up] = temp;
			}
		}
		a[lb] = a[up];
		a[up] = pi;
		return up;
	}
	void Qsort(int a[],int lb,int ub) {
		if(lb<ub) {
			int j = partition(a,lb,ub);
			Qsort(a,lb,j-1);
			Qsort(a,j+1,ub);
		}
	}
		void display() {
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
	}
}
public class QuckSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Elements");
		int x=s.nextInt();
		Quicksort_class q = new Quicksort_class(x);
		q.generator();
		long start_time = System.currentTimeMillis();
		q.Qsort(q.a, 0, q.n-1);
		long end_time = System.currentTimeMillis();
		double time_taken = (end_time - start_time);
		System.out.println("\n The Sorted Array is :");
		q.display();
		System.out.println("\n Time taken = "+time_taken+" MilliSeconds");
	}

}