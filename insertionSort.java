public class insertionSort {

  /*Function to sort array using insertion sort*/
  void sort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  /* A utility function to print array of size n*/
  static void printArray(int arr[]) {
    int n = arr.length;
    System.out.println("sorted Array :");
    for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");

    System.out.println();
  }

  // Driver method
  public static void main(String args[]) {
    int arr[] = { 12, 11, 13, 5, 6 };
    long start_time = System.currentTimeMillis();
    insertionSort ob = new insertionSort();
    ob.sort(arr);
    long end_time = System.currentTimeMillis();
    printArray(arr);
    System.out.println(
      "\nTime taken=" + (end_time - start_time) + "  Milli seconds"
    );
  }
}
