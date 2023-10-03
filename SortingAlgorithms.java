import java.util.Arrays;

// Given Array: 11 5 14 10 2
    // Bubble Sort:
    // Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
    // Step 1:
    // Compare 11 and 5. Swap them because 11 > 5.
    // Array becomes: 5 11 14 10 2
    // Step 2:
    // Compare 11 and 14. No swap needed.
    // Array remains: 5 11 14 10 2
    // Step 3:
    // Compare 14 and 10. Swap them because 14 > 10.
    // Array becomes: 5 11 10 14 2
    // Step 4:
    // Compare 14 and 2. Swap them because 14 > 2.
    // Array becomes: 5 11 10 2 14
    // Now, the largest element (14) is in its correct position. Repeat the above steps for the remaining elements.
    // Step 5:
    // Compare 5 and 11. No swap needed.
    // Array remains: 5 11 10 2 14
    // Step 6:
    // Compare 11 and 10. Swap them because 11 > 10.
    // Array becomes: 5 10 11 2 14
    // Step 7:
    // Compare 11 and 2. Swap them because 11 > 2.
    // Array becomes: 5 10 2 11 14
    // Repeat the process until the entire array is sorted. The array becomes: 2 5 10 11 14, and Bubble Sort is complete.

    // Selection Sort:
    // Selection Sort works by repeatedly selecting the minimum element from the unsorted portion of the array and putting it at the beginning. It then proceeds to the next unsorted portion.
    // Step 1:
    // Find the minimum element (2) and swap it with the first element (11).
    // Array becomes: 2 5 14 10 11
    // Step 2:
    // Find the minimum element (5) in the remaining unsorted portion (5 14 10 11) and swap it with the second element (5).
    // Array remains: 2 5 14 10 11
    // Step 3:
    // Find the minimum element (10) in the remaining unsorted portion (14 10 11) and swap it with the third element (14).
    // Array becomes: 2 5 10 14 11
    // Step 4:
    // Find the minimum element (11) in the remaining unsorted portion (11 14) and swap it with the fourth element (14).
    // Array becomes: 2 5 10 11 14
    // Selection Sort is complete, and the array is sorted.

    // Insertion Sort:
    // Insertion Sort builds the final sorted array one item at a time. It takes each element from the input and inserts it into its correct position within the sorted portion of the array.
    // Step 1:
    // Start with the first element (11).
    // Array remains: 11 5 14 10 2
    // Step 2:
    // Take the second element (5) and insert it into its correct position within the sorted portion (11).
    // Array becomes: 5 11 14 10 2
    // Step 3:
    // Take the third element (14) and insert it into its correct position within the sorted portion (5 11).
    // Array becomes: 5 11 14 10 2
    // Step 4:
    // Take the fourth element (10) and insert it into its correct position within the sorted portion (5 11 14).
    // Array becomes: 5 10 11 14 2
    // Step 5:
    // Take the fifth element (2) and insert it into its correct position within the sorted portion (5 10 11 14).
    // Array becomes: 2 5 10 11 14
    // Insertion Sort is complete, and the array is sorted.

public class SortingAlgorithms {
  // Bubble Sort
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        // Compare adjacent elements
        if (arr[j] > arr[j + 1]) {
          // Swap them if they are in the wrong order
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  // Selection Sort
  public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // Find the minimum element in the unsorted portion
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      // Swap the minimum element with the first element in the unsorted portion
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  // Insertion Sort
  public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      // Move elements of arr[0..i-1], that are greater than key,
      // to one position ahead of their current position
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] arr = {11, 5, 14, 10, 2};

    // Sort the array using the three sorting algorithms
    bubbleSort(arr.clone());
    int[] sortedArrBubble = arr.clone();

    selectionSort(arr.clone());
    int[] sortedArrSelection = arr.clone();

    insertionSort(arr.clone());
    int[] sortedArrInsertion = arr.clone();

    // Print the sorted arrays
    System.out.println("Bubble Sort Result: " + Arrays.toString(sortedArrBubble));
    System.out.println("Selection Sort Result: " + Arrays.toString(sortedArrSelection));
    System.out.println("Insertion Sort Result: " + Arrays.toString(sortedArrInsertion));
  }
}
