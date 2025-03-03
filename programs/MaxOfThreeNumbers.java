package programs;

public class MaxOfThreeNumbers {

  public static void main(String[] args) {

    int x = 122;
    int y = 132;
    int z = 14;

    if (x > y && x > z) {
      System.out.println(x + " is greater");
    } else if (y > z) {
      System.out.println(y + " is greater");
    } else {
      System.out.println(z + " is greater");
    }

    

  }

}
