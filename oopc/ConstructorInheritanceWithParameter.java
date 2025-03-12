package oopc;

class Laptop {
  String name;
  int price;

  //best way to initialize the class variable
  Laptop(String n, int p) { // parameterized constructor
    name = n;
    price = p;
  }
}

class Keyboard extends Laptop {
  int no_of_keys;
  Keyboard(int n,String na, int p) {
    super(na, p); // super keyword is used to call the parent class constructor
    no_of_keys = n;
  }
}

public class ConstructorInheritanceWithParameter {

  public static void main(String[] args) {

    // child class default constructor calls parent class default constructor automatically

    // Laptop lp = new Laptop("Dell", 50000);
    Keyboard kb = new Keyboard(56,"Asus",50000);
    System.out.println(kb.name);
    System.out.println(kb.price);
    System.out.println(kb.no_of_keys);

    // wrapper class
    // primitive to object
    // Scanner class
    // Encapsulation

  }

}
