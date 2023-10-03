public class WorstCasePossibilities {
  public static void main(String[] args) {
    // Your code goes here

    // For each sorting algorithm:

    // a) Insertion sort: x) not even close to sorted
    // b) Selection sort: y) have just one or two keys out of place
    // c) Bubble sort: z) consist of two separate sorted subsets, one following the other, plus perhaps one or two additional keys out of place

    // Justification:

    // a) In Insertion Sort, even a single element out of place requires shifting all the elements before it. So, the worst-case is when the array is nearly reversed.
    // b) In Selection Sort, the algorithm always selects the minimum (or maximum) element and swaps it with the element in the current position. In the worst case, only one or two elements might be out of place, requiring minimal swaps.
    // c) In Bubble Sort, the largest element continuously "bubbles up" to its correct position. In the worst case, the array consists of two sorted subsets separated by a single element out of place, which requires one pass of the outer loop to detect the first subset and another pass to sort the remaining elements.
  }
}

// for file in *.java; do
//   javac "$file" && java "${file%.java}"
// done

