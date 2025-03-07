public class MyFunction {

  // function definition
  static void maruFunction() {
    System.out.println("maru function");
  }

  // function with parameters

  static void sumKaro(int a, int b) { // a and b are in local scope
    System.out.println(a + b);
  }

  // function return type
  static float taruFunction() { // function act as a variable
    return 23.56f;
  }


  // function with return type and parameters
  static int add(int a, int b) {
    return a + b;
  }

  static int sub(int a, int b) {
    return a - b;
  }

  public static void main(String[] args) {

    // functions
    // function is a block of code that runs when called it
    // function can be called multiple times
    // function can be called from anywhere in the program
    // reusability

    // function name
    // function parameters
    // function body
    // function return type

    // kotlin

    maruFunction();
    maruFunction();
    maruFunction();
    maruFunction();

    sumKaro(10, 20);
    sumKaro(100, 200);
    sumKaro(1000, 2000);

    System.out.println(taruFunction());

    // float result = 10.34f + taruFunction();
    System.out.println(10.34f + taruFunction());

    System.out.println(add(10, 20) + sub(50, 60));

    System.out.println(12 + 13);
    System.out.println("Hello " + "Hi"); // operator overloading

    int result = add( sub(20, 10), sub(50, 60));   // higher order function
    System.out.println(result);
  }

}
