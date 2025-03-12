package oopc;

class Person3 { // Object

  // data members
  String name;

  Person3(String n) {
    name = n;
  }

}

public class ObjectClass {
  public static void main(String[] args) {

    Person3 p = new Person3("Sumit");
    Person3 p2 = new Person3("Sumit");

    System.out.println(p == p2); // == check value in stack
    System.out.println(p.hashCode());  // hashing algorithm

  }
}
