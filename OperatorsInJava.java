public class OperatorsInJava {

  public static void main(String[] args) {

    // operators are the symbols
    // arithmetic operator
    // + - * / %(modulo)
    // value in return


    int a = 10;
    int b = 20;
    System.out.println(a + b);
    System.out.println(a - b); // -10
    System.out.println(a * b);
    System.out.println(a / b); // integer division

    float a1 = 10.2f;
    float b1 = 20.2f;
    System.out.println(a1 / b1);

    // % // reminder // shesh
    System.out.println(10 % 3);
    System.out.println(2 % 10);


    System.out.println(12789 % 10); // last digit
    System.out.println(12789 / 10); // remove last digit

    // relational operator  // conditional operator
    // < > <= >= ==  !=
    // return boolean

    System.out.println(10 > 20);

    boolean bh = 10 > 20;
    System.out.println(bh);

    // == euqality operator     // are only for primitive datatypes
    System.out.println(10 == 20);
    // != inquality operator
    System.out.println(10 != 20);

    // logical operator
    // &&(and)  ||(or)  !(not)
        // return boolean
    System.out.println(!(10 > 20 && 10 < 20)); // false
    System.out.println(10 > 20 || 10 < 20); // true

    System.out.println(!(10 < 20));

    // assignment operator
    // = += -= *= /= %=

    int a2 = 67;

    a2 += 10;
    // a2 = a2 + 10;
    System.out.println(a2);

    a2 %= 10;
    System.out.println(a2);


    // bitwise operator
    // << >>
    System.out.println(10 >> 2); // 10

    // conditional statement
    // ternary operator ?:

  }

}
