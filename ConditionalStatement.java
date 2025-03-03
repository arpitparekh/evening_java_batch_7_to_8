public class ConditionalStatement {

  public static void main(String[] args) {

    // if else
    // if else ladder
    // nested if
    // swtich case
    // ternary operator   ?:

    // condtional statement used  to define the flow of the program

    int a = 10;

    if (a>20) {
      System.out.println("a is less than 20");
    } else {
      System.out.println("a is greater than 20");
    }

    // if else ladder
    // else if

    // check if the number is positive or negetive or zero

    int num = 23;

    if (num > 0) {
      System.out.println("num is positive");
    }else if(num < 0) {
      System.out.println("num is negetive");
    } else {
      System.out.println("num is zero");
    }

    // nested if
    // if else inside if

    int a1 = 40;
    int b1 = 20;

    if (a1 < b1) {

      if(a1>34){
        System.out.println("Hi");
      }else{
        System.out.println("Hello");
      }

    } else {
      if (a1 > 10) {
        System.out.println("Hola");
      } else {
        System.out.println("Namaste");
      }
    }

    // switch case
    // takes value value inside a parameter
    int data = 44;

    switch (data) {

      case 23:
        System.out.println("23");
        break;
      case 34:
        System.out.println("34");
        break;
      case 67:
        System.out.println("67");
        break;
      default:
        System.out.println("default");

    }

    // ternary operator ?:
    // ternary operator is used to display if else in one line
    // ternary will not take print statement

    int l = 66;

    int result =  l > 10 ? 11 : 22;
    System.out.println(result);

    // java does not have pointers
    

  }

}
