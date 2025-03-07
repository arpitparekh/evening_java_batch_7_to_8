package programs;

public class PrimeNumber {

  static void checkPrime(int num) {
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

  public static void main(String[] args) {

    // prime number
    checkPrime(12);
    checkPrime(23);
    checkPrime(33);
    checkPrime(79);
    checkPrime(73);

  }

}
