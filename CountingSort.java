import java.util.Arrays;

public class CountingSort {
  public static int[] booleanSort(int[] x) {
    int max = Arrays.stream(x).max().orElse(0);
    boolean[] flag = new boolean[max + 1];

    for (int i : x) {
      flag[i] = true;
    }

    int[] sorted = new int[x.length];
    int index = 0;

    for (int i = 0; i <= max; i++) {
      if (flag[i]) {
        sorted[index++] = i;
      }
    }

    return sorted;
  }

  public static void main(String[] args) {
    int[] x = {4, 2, 4, 1, 3, 2, 3};
    int[] sorted = booleanSort(x);
    System.out.println("Sorted Array: " + Arrays.toString(sorted));
  }
}
