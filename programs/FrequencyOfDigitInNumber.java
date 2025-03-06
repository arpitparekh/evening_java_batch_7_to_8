package programs;

public class FrequencyOfDigitInNumber {

  public static void main(String[] args) {

    int num = 98643321; // array

    int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    // 0 1 2 3 4 5 6 7 8 9

    while (num != 0) {
      int digit = num % 10;
      arr[digit]++; // logic
      num = num / 10;
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        System.out.println(i + " => " + arr[i]);
      }
    }

  }

}
