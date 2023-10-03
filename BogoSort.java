import java.util.Arrays;
import java.util.Random;

public class BogoSort {
  public static void bogoSort(int[] a) {
    while (!isSorted(a)) {
      shuffle(a);
    }
  }

  private static boolean isSorted(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }
    return true;
  }

  private static void shuffle(int[] a) {
    Random rand = new Random();
    for (int i = a.length - 1; i > 0; i--) {
      int j = rand.nextInt(i + 1);
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = {5, 2, 9, 1, 5};
    bogoSort(arr);
    System.out.println("Sorted Array: " + Arrays.toString(arr));
  }
}
