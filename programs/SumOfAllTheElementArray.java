package programs;

public class SumOfAllTheElementArray {

  public static void main(String[] args) {

    int[] arr = { 6, 7, 9, 7, 4, 2, 54, 7, 7, 3, 3, 1, 3, 1 };
    // find the sum of all the elements from the array

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i < 5) {
        sum += arr[i];
      }
    }
    System.out.println("Sum of elements are : " + sum);
    
  }

}
