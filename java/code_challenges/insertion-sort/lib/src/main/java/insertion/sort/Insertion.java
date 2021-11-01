package insertion.sort;


import java.util.Arrays;

////////////////////////////////////////////////////Challenge 26///////////////////////////////////////////////////////
public class Insertion {
    public static int[] InsertionSort(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
        int j = i - 1;
        int temp = arr[i];

        while (j >= 0 && temp < arr[j]) {
          arr[j + 1] = arr[j];
          j = j - 1;
        }
        arr[j + 1] = temp;
      }
      return arr;
    }


  ////////////////////////////////////////////////////Challenge 27///////////////////////////////////////////////////////

  public static int[] mergeSort(int[] arr) {
    int n = arr.length;
    if (n > 1) {
      int mid = n / 2;

//      int[] left = new int[mid];
//      int[] right = new int[n - mid];
//      //left
//      for (int i = 0; i < mid; i++) {
//        left[i] = arr[i];
//      }
//      //right
//      for (int i = mid; i < n; i++) {
//        right[i - mid] = arr[i];
//      }

      int[] left = Arrays.copyOfRange(arr,0,mid);
      int [] right = Arrays.copyOfRange(arr,mid,n);

      //merging
      mergeSort(left);
      mergeSort(right);
      merge(left, right, arr);
    }
    return arr;
  }

  private static void merge(int[] left, int[] right, int[] arr) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }
    while (i < left.length) {
      arr[k++] = left[i++];
    }
    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }
}

