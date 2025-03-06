package programs;

public class FirstAndLastDigitOfNumber {

  public static void main(String[] args) {


    int num = 12345;

    int  last = num % 10;

    int first = 0;

    while (num != 0) {
      first = num % 10;
      num /= 10;
    }

    System.out.println("First Digit : " + first);
    System.out.println("Last Digit : " + last);
    
  }

}
