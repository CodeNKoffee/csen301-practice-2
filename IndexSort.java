import java.util.Arrays;

public class IndexSort {
  public static int[] indexSort(int[] x) {
    int n = x.length;
    int[] y = new int[n]; // Resulting array

    for (int i = 0; i < n; i++) {
      int count = 0; // Initialize count to 0 for each element in x
      for (int j = 0; j < n; j++) {
        if (x[j] < x[i] || (x[j] == x[i] && j < i)) {
          count++;
        }
      }
      y[count] = x[i];
    }

    return y;
  }

  public static void main(String[] args) {
    int[] inputArray = {4, 3, 8, 2};
    int[] sortedArray = indexSort(inputArray);

    System.out.println("Original Array: " + Arrays.toString(inputArray));
    System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
  }
}
