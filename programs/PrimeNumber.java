package programs;

public class PrimeNumber {

  public static void main(String[] args) {

    // prime number
    // prime number is a number that is divisible by 1 and itself

    int num = 101; // 2..12 // 55 // 2..54 // 77 // 2..76

    boolean b = true;

    for (int i = 2; i < num; i++) { // 2..12

      if (num % i == 0) {
        b = false;
        break;
      }

    }

    if (b) {
      System.out.println("prime number");
    } else {
      System.out.println("not prime number");
    }

  }

}
