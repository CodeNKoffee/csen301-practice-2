import java.util.Arrays;

public class ShakerSort {
  public static void shakerSort(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    boolean swapped;

    do {
      swapped = false;

      // From the beginning
      for (int i = left; i < right; i++) {
        if (arr[i] > arr[i + 1]) {
          // Swap arr[i] and arr[i+1]
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }

      right--;

      // From the end
      for (int i = right; i > left; i--) {
        if (arr[i] < arr[i - 1]) {
          // Swap arr[i] and arr[i-1]
          int temp = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = temp;
          swapped = true;
        }
      }

      left++;
    } while (swapped);
  }

  public static void main(String[] args) {
    int[] arr = {7, 5, 11, 10, 8};
    shakerSort(arr);
    System.out.println("Sorted Array: " + Arrays.toString(arr));
  }
}
