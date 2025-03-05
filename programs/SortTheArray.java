package programs;

import java.util.Arrays;

public class SortTheArray {

  public static void main(String[] args) {

    int[] arr = { 4, 65, 8, 7, 5, 4, 4, 658, 89 };
    //            0  1  2  3  4  5  6  7  8

    // assending order
    // bubble sort

    for (int i = 0; i < arr.length; i++) {

      for (int j = i + 1; j < arr.length; j++) { // 1 .. 8

        if (arr[i] > arr[j]) {

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }

      }

    }

    System.out.println(Arrays.toString(arr));









    // swapping a variable using third variable

    // int a = 12; // 25   // 13
    // int b = 13; // 13  // 12

    // // temp = a;
    // // a = b;
    // // b = temp;
    // // a = a + b;
    // // b = a - b;
    // // a = a - b;

    // System.out.println(a);
    // System.out.println(b);


  }

}
