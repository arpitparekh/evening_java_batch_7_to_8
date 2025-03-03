package programs;

public class NoOfDigit {

  public static void main(String[] args) {


    int num = 123456;

    int count = 0;

    while (num != 0) {
      count++;
      num = num / 10;  // 1234  // 123  / /12  // 1
    }

    System.out.println("No of Digit in a number is : "+count);

  }

}
