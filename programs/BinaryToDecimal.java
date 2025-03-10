public class BinaryToDecimal{
  public static void main(String args[]){

    int binary = 1010101;

    int counter = 0;

    int decimal = 0;

    while (binary != 0) {

      int last = binary % 10;

      decimal = decimal + last * (int) Math.pow(2, counter);

      binary = binary / 10;
      counter++;

    }

    System.out.println(decimal);


  }
}
