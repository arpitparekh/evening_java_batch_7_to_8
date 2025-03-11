package oopc;

class Father {
  Father() {   // default constructor
    System.out.println("Father constructor");
  }
}

class Son extends Father {
  Son() {
    System.out.println("Son constructor");
  }
}

class GrandSon extends Son{

  GrandSon() {
    System.out.println("GrandSon constructor");
  }
}

// constructor chaining

public class InheritancewithConstructor {

  public static void main(String[] args) {

    // inheritance with constructor
    // child class constructor will always calls parent class constrcutor automatically

    // child class default constrcutor always calls parent class default constrcutor automatically

    GrandSon gs = new GrandSon();


  }

}
