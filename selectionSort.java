class sSort {

  void sort(int arr[]) {
    int n = arr.length;

    
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n - 1; i++) {
      //   System.out.println(i);
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        // System.out.println(j);
        if (arr[j] < arr[min_idx]) min_idx = j;
      }

      // Swap the minimum element found with the first
      // element
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  // Prints the array
  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
    System.out.println();
  }
}

public class selectionSort {

  public static void main(String args[]) {
    sSort ob = new sSort();
    int arr[] = { 999, 1000, 4500, 111, 5 };
    long start_time = System.currentTimeMillis();
    ob.sort(arr);
    long end_time = System.currentTimeMillis();
    System.out.println("Sorted array");
    ob.printArray(arr);
    System.out.println(
      "\nTime taken=" + (end_time - start_time) + "  Milli seconds"
    );
  }
}
