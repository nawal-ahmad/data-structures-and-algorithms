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

  ////////////////////////////////////////////////////Challenge 28///////////////////////////////////////////////////////

  private static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = (start - 1);

    for (int j = start; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;

        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
      }
    }

    int swap = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = swap;

    return i + 1;
  }

  public static int[] quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int position = partition(arr, start, end);

      quickSort(arr, start, position - 1);
      quickSort(arr, position + 1, end);
    }
    return arr;
  }

}

