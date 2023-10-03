import java.util.Arrays;

public class RelativeSort {
  public static void sortRelative(int[] a1, int[] a2) {
    int[] counts = new int[1001]; // Assuming the range of elements is [0, 1000]

    // Count the occurrences of elements in a1
    for (int num : a1) {
      counts[num]++;
    }

    int index = 0;

    // Sort a1 based on the order in a2
    for (int num : a2) {
      while (counts[num] > 0) {
        a1[index++] = num;
        counts[num]--;
      }
    }

    // Append remaining elements in sorted order
    for (int i = 0; i < counts.length; i++) {
      while (counts[i] > 0) {
        a1[index++] = i;
        counts[i]--;
      }
    }
  }

  public static void main(String[] args) {
    int[] a1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
    int[] a2 = {2, 1, 8, 3};
    
    sortRelative(a1, a2);
    
    System.out.println("Sorted Array A1: " + Arrays.toString(a1));
  }
}
