package programs;

public class DivisibleBy5And11 {

  public static void main(String[] args) {


    int num = 50;

    if (num % 5 == 0 && num % 11 == 0) {
      System.out.println("Divisible by 5 and 11");
    } else {
      System.out.println("Not divisible by 5 and 11");
    }

  }

}
