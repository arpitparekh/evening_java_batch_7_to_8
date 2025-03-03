package programs;

public class Palindrome {

  public static void main(String[] args) {

    // palindrome
    // 1234321
    // 12321
    // 121

    // num == reverse

    // reverse?
    int num = 1232;
    int copy = num;

    // 1 * 10000
    // 2 * 1000

    // 12321 % 10 = 1
    // 12321 / 10 = 1232

    // 1232 % 10 = 2
    // 1232 / 10 = 123

    // 123 % 10 = 3
    // 123 / 10 = 12

    // 12 % 10 = 2
    // 12 / 10 = 1

    // 1 % 10 = 1
    // 1 / 10 = 0

    int reverse = 0;

    while (num != 0) {
      int last = num % 10;
      reverse = reverse * 10 + last; // 1 // 123 // 1232 // 12321
      num = num / 10;
    }

    if (reverse == copy) {
      System.out.println("palindrome");
    } else {
      System.out.println("not palindrome");
    }


    // 153
    // 1234

    // armstrong
    // 153

  }

}
