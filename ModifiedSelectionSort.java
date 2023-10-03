import java.util.Arrays;

public class ModifiedSelectionSort {
  public static void modifiedSelectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int minIndex = i;
      int maxIndex = i;
      for (int j = i; j < n - i; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
        if (arr[j] > arr[maxIndex]) {
          maxIndex = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;

      if (maxIndex == i) {
        maxIndex = minIndex;
      }

      temp = arr[n - i - 1];
      arr[n - i - 1] = arr[maxIndex];
      arr[maxIndex] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr1 = {6, 4, 5};
    modifiedSelectionSort(arr1);
    System.out.println("Sorted Array 1: " + Arrays.toString(arr1));

    int[] arr2 = {2, 6, 8, 1, 7, 9, 4, 3, 5};
    modifiedSelectionSort(arr2);
    System.out.println("Sorted Array 2: " + Arrays.toString(arr2));
  }
}
