// 26/6/23
package DAA_lab;
import java.util.Scanner;
import java.util.Random;
class Selectionsort{
	void sort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx])
					min_idx = j;
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
public class Select {
	public static void main(String[] args) {
//			do {
				Selectionsort ob = new Selectionsort();
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter number of element to insert ");
				int n = obj.nextInt();
				int arr[] = new int[n];
				System.out.println("Generating "+n+" random number");
				Random r = new Random();
				for(int i=0;i<n;i++) {
					arr[i] = r.nextInt(100);
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				long start_time = System.currentTimeMillis();
				ob.sort(arr);
				long end_time = System.currentTimeMillis();
				System.out.println("Sorted Array");
				ob.printArray(arr);
				System.out.println("\n Time taken = "+(end_time-start_time)+" Milli Secinds");
//				System.out.println("Do you want to continue (yes/no)");
//				String sel = obj.next();
//			}while(sel != "no");
	}

}
