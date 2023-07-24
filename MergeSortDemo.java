package DAA_lab;
import java.util.*;
class Mergesort{
	int n;
	int a[];
	Mergesort(int x){
		n=x;
		a=new int[n];
	}
	void generate()	{
		System.out.println("Generating n random number.....");
		Random r=new Random();
		for(int i=0;i<=n;i++){
			a[i]=r.nextInt(20);
			System.out.println(a[i]+" ");
		}
	}
	void Merge(int low,int mid,int high){
		int h,i,j,k;
		int [] b=new int[n];
		h=low; i=low; j=mid+1;
		while((h<=mid)&&(j<=high)){
			if(a[h]<=a[j]){
				b[i]=a[h];
				h=h+1;
			}
			else{
				b[i]=a[j];
				j=j+1;
			}
			i=i+1;
		}
		if(h>mid){
			for(k=j;k<=high;k++){
				b[i]=a[k];
				i=i+1;
			}
		}
		else{
			for(k=h;k<mid;k++){
				b[i]=a[k];
				i=i+1;
		}
	}
	for(k=low;k<=high;k++)
		a[k]=b[k];	
	}
	void Msort(int low,int high){
		if(low<high){
			int mid=(low+high)/2;
				Msort(low,mid);
			Msort(mid+1,high);
		Merge(low,mid,high);
		}
	}
	void display(){
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
public class MergeSortDemo{
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the nuber of elements");
		int x=s.nextInt();
		Mergesort m=new Mergesort(x);
		m.generate();
		long start_time = System.currentTimeMillis();
		m.Msort(0,n-1);
		long end_time = System.currentTimeMillis();
		double time_taken = start_time-end_time;
		System.out.println("\n the sorted array is:");
		m.display();
		System.out.println("\n Time taken="+"(end_time-start_time)"+"Milli seconds");  
	}
}