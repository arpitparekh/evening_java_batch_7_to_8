import java.util.Arrays;

public class MyArray {

  public static void main(String[] args) {


    // arrays
    // group of similar type of elements
    // object datatype
    // part of dsa

    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };  //  initialize
    //            0  1  2  3  4  5  6  7

    System.out.println(arr[4]);

    System.out.println(arr.length);

    for (int i = 0; i < arr.length; i++) {
      System.out.println("[" + i + "] = " + arr[i]);
    }

    // for in loop in java
    for (int i : arr) { // looping through values
      System.out.println(i);
    }

    // new keyword is used to allocation memory in heap
    // declaring array
    float[] data = new float[5]; // this 20 sized empty array
    // int arr[50];

    data[0] = 10;
    data[1] = 20;
    data[2] = 30;
    data[3] = 40;
    data[4] = 50;

    for (float i : data) { // looping through values
      System.out.println(i);
    }

    // Arrays
    System.out.println(Arrays.toString(data)); // string representation of array

    // 1 2 3 5 4 2 4 6 8 5 3 3 56

    

  }

}
