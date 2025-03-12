package oopc;

public class MyWrapperClass {

  public static void main(String[] args) {

    // wrapper class
    // 8 primitive data types
    // int, float, double, boolean, char, byte, short, long // stack
    // 8 wrapper classes
    // Integer, Float, Double, Boolean, Character, Byte, Short, Long // heap
    // java.lang library is automatically imported

    // int i2 = 12; // stack
    // type casting

    // int i = 12; // 4 byte
    // byte b = (byte) i; // 1 byte
    // System.out.println(b);  // garbage value

    // byte b1 = 12;
    // int i1 = b1;

    // boolean < byte < short < char < int < long < float < double

    Integer i = 12; // 4 byte
    Integer i2 = 23;

    int num = 23;
    Integer obj = num;  // boxing

    Integer i3 = 45;

    String data = i3.toString();
    System.out.println(data);

    String str = "23233";
    Integer myNumber = Integer.parseInt(str);
    System.out.println(myNumber);

  }

}
