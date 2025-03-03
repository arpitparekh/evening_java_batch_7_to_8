public class Loops {
  public static void main(String[] args) {

    // loops
    // loops are used for repeatative tasks
    // loops are used for sequentioal task
    // loops are used for iterating over a collection of data
    // there are three types of loops
    // while
    // do while
    // for

    // initial value
    // condition
    // increment or decrement

    int a = 10;

    while (a <= 50) {
      System.out.println("Hello");
      a++;
    }

    // do while
    // initial value
    // increment or decrement
    // condition

    int b = 20;
    do{
      System.out.println("Kem cho");
      b++;
    } while (b <= 30);


    // for loop
    for (int num = 10; num <= 20; num++) {
      System.out.println(num);
    }

    // print odd number between 100 to 50

    for (int num = 100; num >= 50; num--) {
      if (num % 2 == 1) {
        System.out.println(num);
      }
    }


    String name = "Bascom";


    // for in loop
    // for (char ch : name.toCharArray()) {
    //   System.out.println(ch);
    // }

  }
}
